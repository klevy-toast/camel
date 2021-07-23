/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.pulsar.integration;

import org.apache.camel.Endpoint;
import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.component.pulsar.PulsarComponent;
import org.apache.camel.component.pulsar.utils.AutoConfiguration;
import org.apache.camel.spi.Registry;
import org.apache.camel.support.SimpleRegistry;
import org.apache.pulsar.client.api.Producer;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;
import org.apache.pulsar.client.api.Schema;
import org.apache.pulsar.client.impl.ClientBuilderImpl;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class PulsarSharedSubscriptionMessageDistributionIT extends PulsarITSupport {

    private static final Logger LOGGER = LoggerFactory.getLogger(PulsarSharedSubscriptionMessageDistributionIT.class);

    private static final String TOPIC_URI = "persistent://public/default/shared-camel-topic";
    private static final String PRODUCER = "camel-producer";
    private static final String route2Name = "route2";
    private static final int NUMBER_OF_CONSUMERS = 1;
    private static final int NUMBER_OF_MESSAGES = 10;

    @EndpointInject("pulsar:" + TOPIC_URI + "?numberOfConsumers="+ NUMBER_OF_CONSUMERS + "&subscriptionType=Shared"
                    + "&subscriptionName=camel-subscription&consumerQueueSize=1&consumerNamePrefix=camel-consumer1-")
    private Endpoint from1;

    @EndpointInject("pulsar:" + TOPIC_URI + "?numberOfConsumers="+ NUMBER_OF_CONSUMERS + "&subscriptionType=Shared"
            + "&subscriptionName=camel-subscription&consumerQueueSize=1&consumerNamePrefix=camel-consumer2-")
    private Endpoint from2;

    @EndpointInject("mock:result1")
    private MockEndpoint to1;

    @EndpointInject("mock:result2")
    private MockEndpoint to2;

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {

            Processor processor = new Processor() {
                @Override
                public void process(final Exchange exchange) throws InterruptedException {
                    LOGGER.info("Processing message {} on Thread {}", exchange.getIn().getHeader("message_id"), Thread.currentThread());
                    Thread.sleep(1000);
                }
            };

            @Override
            public void configure() {
                from(from1).to(to1).process(processor);
                from(from2).to(to2).process(processor).routeId(route2Name);
            }
        };
    }

    @Override
    protected Registry createCamelRegistry() throws Exception {
        SimpleRegistry registry = new SimpleRegistry();

        registerPulsarBeans(registry);

        return registry;
    }

    private void registerPulsarBeans(SimpleRegistry registry) throws PulsarClientException {
        PulsarClient pulsarClient = concurrentPulsarClient();
        AutoConfiguration autoConfiguration = new AutoConfiguration(null, null);

        registry.bind("pulsarClient", pulsarClient);
        PulsarComponent comp = new PulsarComponent(context);
        comp.setAutoConfiguration(autoConfiguration);
        comp.setPulsarClient(pulsarClient);
        registry.bind("pulsar", comp);

    }

    private PulsarClient concurrentPulsarClient() throws PulsarClientException {
        return new ClientBuilderImpl().serviceUrl(getPulsarBrokerUrl()).ioThreads(5).listenerThreads(5).build();
    }

    @Test
    public void testLateStartupOfSecondConsumer() throws Exception {
        // if we have 2 consumers on shared subscription, and one comes online later while there are messages pending,
        // both should handle messages
        context().getRouteController().stopRoute(route2Name);

        Producer<String> producer
                = concurrentPulsarClient().newProducer(Schema.STRING).producerName(PRODUCER).topic(TOPIC_URI).create();

        to1.expectedMinimumMessageCount(1);
        to2.expectedMinimumMessageCount(1);

        for (int i = 0; i < NUMBER_OF_MESSAGES; i++) {
            producer.send("Hello World!");
        }

        context().getRouteController().startRoute(route2Name);

        MockEndpoint.assertIsSatisfied(10, TimeUnit.SECONDS, to1);
        MockEndpoint.assertIsSatisfied(10, TimeUnit.SECONDS, to2);

        producer.close();
    }
}
