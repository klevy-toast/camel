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
 * Collect various metrics directly from Camel routes using the DropWizard
 * metrics library.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MetricsEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Metrics component.
     */
    public interface MetricsEndpointBuilder extends EndpointProducerBuilder {
        /**
         * Action when using timer type.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.metrics.MetricsTimerAction&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param action the value to set
         * @return the dsl builder
         */
        default MetricsEndpointBuilder action(
                org.apache.camel.component.metrics.MetricsTimerAction action) {
            doSetProperty("action", action);
            return this;
        }
        /**
         * Action when using timer type.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.metrics.MetricsTimerAction&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param action the value to set
         * @return the dsl builder
         */
        default MetricsEndpointBuilder action(String action) {
            doSetProperty("action", action);
            return this;
        }
        /**
         * Decrement value when using counter type.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param decrement the value to set
         * @return the dsl builder
         */
        default MetricsEndpointBuilder decrement(Long decrement) {
            doSetProperty("decrement", decrement);
            return this;
        }
        /**
         * Decrement value when using counter type.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param decrement the value to set
         * @return the dsl builder
         */
        default MetricsEndpointBuilder decrement(String decrement) {
            doSetProperty("decrement", decrement);
            return this;
        }
        /**
         * Increment value when using counter type.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param increment the value to set
         * @return the dsl builder
         */
        default MetricsEndpointBuilder increment(Long increment) {
            doSetProperty("increment", increment);
            return this;
        }
        /**
         * Increment value when using counter type.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param increment the value to set
         * @return the dsl builder
         */
        default MetricsEndpointBuilder increment(String increment) {
            doSetProperty("increment", increment);
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
        default MetricsEndpointBuilder lazyStartProducer(
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
        default MetricsEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Mark when using meter type.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param mark the value to set
         * @return the dsl builder
         */
        default MetricsEndpointBuilder mark(Long mark) {
            doSetProperty("mark", mark);
            return this;
        }
        /**
         * Mark when using meter type.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param mark the value to set
         * @return the dsl builder
         */
        default MetricsEndpointBuilder mark(String mark) {
            doSetProperty("mark", mark);
            return this;
        }
        /**
         * Subject value when using gauge type.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param subject the value to set
         * @return the dsl builder
         */
        default MetricsEndpointBuilder subject(Object subject) {
            doSetProperty("subject", subject);
            return this;
        }
        /**
         * Subject value when using gauge type.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param subject the value to set
         * @return the dsl builder
         */
        default MetricsEndpointBuilder subject(String subject) {
            doSetProperty("subject", subject);
            return this;
        }
        /**
         * Value value when using histogram type.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param value the value to set
         * @return the dsl builder
         */
        default MetricsEndpointBuilder value(Long value) {
            doSetProperty("value", value);
            return this;
        }
        /**
         * Value value when using histogram type.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param value the value to set
         * @return the dsl builder
         */
        default MetricsEndpointBuilder value(String value) {
            doSetProperty("value", value);
            return this;
        }
    }

    public interface MetricsBuilders {
        /**
         * Metrics (camel-metrics)
         * Collect various metrics directly from Camel routes using the
         * DropWizard metrics library.
         * 
         * Category: monitoring
         * Since: 2.14
         * Maven coordinates: org.apache.camel:camel-metrics
         * 
         * Syntax: <code>metrics:metricsType:metricsName</code>
         * 
         * Path parameter: metricsType (required)
         * Type of metrics
         * There are 5 enums and the value can be one of: gauge, counter,
         * histogram, meter, timer
         * 
         * Path parameter: metricsName (required)
         * Name of metrics
         * 
         * @param path metricsType:metricsName
         * @return the dsl builder
         */
        default MetricsEndpointBuilder metrics(String path) {
            return MetricsEndpointBuilderFactory.endpointBuilder("metrics", path);
        }
        /**
         * Metrics (camel-metrics)
         * Collect various metrics directly from Camel routes using the
         * DropWizard metrics library.
         * 
         * Category: monitoring
         * Since: 2.14
         * Maven coordinates: org.apache.camel:camel-metrics
         * 
         * Syntax: <code>metrics:metricsType:metricsName</code>
         * 
         * Path parameter: metricsType (required)
         * Type of metrics
         * There are 5 enums and the value can be one of: gauge, counter,
         * histogram, meter, timer
         * 
         * Path parameter: metricsName (required)
         * Name of metrics
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path metricsType:metricsName
         * @return the dsl builder
         */
        default MetricsEndpointBuilder metrics(String componentName, String path) {
            return MetricsEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static MetricsEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class MetricsEndpointBuilderImpl extends AbstractEndpointBuilder implements MetricsEndpointBuilder {
            public MetricsEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new MetricsEndpointBuilderImpl(path);
    }
}