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
 * Send passive checks to Nagios using JSendNSCA.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface NagiosEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Nagios component.
     */
    public interface NagiosEndpointBuilder extends EndpointProducerBuilder {
        /**
         * Connection timeout in millis.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: producer
         * 
         * @param connectionTimeout the value to set
         * @return the dsl builder
         */
        default NagiosEndpointBuilder connectionTimeout(int connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Connection timeout in millis.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: producer
         * 
         * @param connectionTimeout the value to set
         * @return the dsl builder
         */
        default NagiosEndpointBuilder connectionTimeout(String connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
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
        default NagiosEndpointBuilder lazyStartProducer(
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
        default NagiosEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether or not to use synchronous when sending a passive check.
         * Setting it to false will allow Camel to continue routing the message
         * and the passive check message will be send asynchronously.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param sendSync the value to set
         * @return the dsl builder
         */
        default NagiosEndpointBuilder sendSync(boolean sendSync) {
            doSetProperty("sendSync", sendSync);
            return this;
        }
        /**
         * Whether or not to use synchronous when sending a passive check.
         * Setting it to false will allow Camel to continue routing the message
         * and the passive check message will be send asynchronously.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param sendSync the value to set
         * @return the dsl builder
         */
        default NagiosEndpointBuilder sendSync(String sendSync) {
            doSetProperty("sendSync", sendSync);
            return this;
        }
        /**
         * Sending timeout in millis.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: producer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default NagiosEndpointBuilder timeout(int timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Sending timeout in millis.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: producer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default NagiosEndpointBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * To specify an encryption method.
         * 
         * The option is a:
         * &lt;code&gt;com.googlecode.jsendnsca.encryption.Encryption&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param encryption the value to set
         * @return the dsl builder
         */
        default NagiosEndpointBuilder encryption(
                com.googlecode.jsendnsca.encryption.Encryption encryption) {
            doSetProperty("encryption", encryption);
            return this;
        }
        /**
         * To specify an encryption method.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.googlecode.jsendnsca.encryption.Encryption&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param encryption the value to set
         * @return the dsl builder
         */
        default NagiosEndpointBuilder encryption(String encryption) {
            doSetProperty("encryption", encryption);
            return this;
        }
        /**
         * Password to be authenticated when sending checks to Nagios.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default NagiosEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
    }

    public interface NagiosBuilders {
        /**
         * Nagios (camel-nagios)
         * Send passive checks to Nagios using JSendNSCA.
         * 
         * Category: monitoring
         * Since: 2.3
         * Maven coordinates: org.apache.camel:camel-nagios
         * 
         * Syntax: <code>nagios:host:port</code>
         * 
         * Path parameter: host (required)
         * This is the address of the Nagios host where checks should be send.
         * 
         * Path parameter: port (required)
         * The port number of the host.
         * 
         * @param path host:port
         * @return the dsl builder
         */
        default NagiosEndpointBuilder nagios(String path) {
            return NagiosEndpointBuilderFactory.endpointBuilder("nagios", path);
        }
        /**
         * Nagios (camel-nagios)
         * Send passive checks to Nagios using JSendNSCA.
         * 
         * Category: monitoring
         * Since: 2.3
         * Maven coordinates: org.apache.camel:camel-nagios
         * 
         * Syntax: <code>nagios:host:port</code>
         * 
         * Path parameter: host (required)
         * This is the address of the Nagios host where checks should be send.
         * 
         * Path parameter: port (required)
         * The port number of the host.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path host:port
         * @return the dsl builder
         */
        default NagiosEndpointBuilder nagios(String componentName, String path) {
            return NagiosEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static NagiosEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class NagiosEndpointBuilderImpl extends AbstractEndpointBuilder implements NagiosEndpointBuilder {
            public NagiosEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new NagiosEndpointBuilderImpl(path);
    }
}