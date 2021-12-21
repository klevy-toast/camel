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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Perform operations on Hazelcast distributed ringbuffer.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface HazelcastRingbufferEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Hazelcast Ringbuffer component.
     */
    public interface HazelcastRingbufferEndpointBuilder
            extends
                EndpointProducerBuilder {
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.hazelcast.HazelcastOperation&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param defaultOperation the value to set
         * @return the dsl builder
         */
        default HazelcastRingbufferEndpointBuilder defaultOperation(
                org.apache.camel.component.hazelcast.HazelcastOperation defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.hazelcast.HazelcastOperation&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param defaultOperation the value to set
         * @return the dsl builder
         */
        default HazelcastRingbufferEndpointBuilder defaultOperation(
                String defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option is a:
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastRingbufferEndpointBuilder hazelcastInstance(
                com.hazelcast.core.HazelcastInstance hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastRingbufferEndpointBuilder hazelcastInstance(
                String hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param hazelcastInstanceName the value to set
         * @return the dsl builder
         */
        default HazelcastRingbufferEndpointBuilder hazelcastInstanceName(
                String hazelcastInstanceName) {
            doSetProperty("hazelcastInstanceName", hazelcastInstanceName);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default HazelcastRingbufferEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default HazelcastRingbufferEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface HazelcastRingbufferBuilders {
        /**
         * Hazelcast Ringbuffer (camel-hazelcast)
         * Perform operations on Hazelcast distributed ringbuffer.
         * 
         * Category: cache,datagrid
         * Since: 2.16
         * Maven coordinates: org.apache.camel:camel-hazelcast
         * 
         * Syntax: <code>hazelcast-ringbuffer:cacheName</code>
         * 
         * Path parameter: cacheName (required)
         * The name of the cache
         * 
         * @param path cacheName
         * @return the dsl builder
         */
        default HazelcastRingbufferEndpointBuilder hazelcastRingbuffer(
                String path) {
            return HazelcastRingbufferEndpointBuilderFactory.endpointBuilder("hazelcast-ringbuffer", path);
        }
        /**
         * Hazelcast Ringbuffer (camel-hazelcast)
         * Perform operations on Hazelcast distributed ringbuffer.
         * 
         * Category: cache,datagrid
         * Since: 2.16
         * Maven coordinates: org.apache.camel:camel-hazelcast
         * 
         * Syntax: <code>hazelcast-ringbuffer:cacheName</code>
         * 
         * Path parameter: cacheName (required)
         * The name of the cache
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path cacheName
         * @return the dsl builder
         */
        default HazelcastRingbufferEndpointBuilder hazelcastRingbuffer(
                String componentName,
                String path) {
            return HazelcastRingbufferEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static HazelcastRingbufferEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class HazelcastRingbufferEndpointBuilderImpl extends AbstractEndpointBuilder implements HazelcastRingbufferEndpointBuilder {
            public HazelcastRingbufferEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new HazelcastRingbufferEndpointBuilderImpl(path);
    }
}