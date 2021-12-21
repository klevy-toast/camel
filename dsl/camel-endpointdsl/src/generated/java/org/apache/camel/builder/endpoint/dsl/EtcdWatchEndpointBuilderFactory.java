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
 * Watch specific etcd keys or directories for changes.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface EtcdWatchEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Etcd Watch component.
     */
    public interface EtcdWatchEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedEtcdWatchEndpointBuilder advanced() {
            return (AdvancedEtcdWatchEndpointBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default EtcdWatchEndpointBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default EtcdWatchEndpointBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To apply an action recursively.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param recursive the value to set
         * @return the dsl builder
         */
        default EtcdWatchEndpointBuilder recursive(boolean recursive) {
            doSetProperty("recursive", recursive);
            return this;
        }
        /**
         * To apply an action recursively.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param recursive the value to set
         * @return the dsl builder
         */
        default EtcdWatchEndpointBuilder recursive(String recursive) {
            doSetProperty("recursive", recursive);
            return this;
        }
        /**
         * The path to look for for service discovery.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: /services/
         * Group: consumer
         * 
         * @param servicePath the value to set
         * @return the dsl builder
         */
        default EtcdWatchEndpointBuilder servicePath(String servicePath) {
            doSetProperty("servicePath", servicePath);
            return this;
        }
        /**
         * To set the URIs the client connects.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: http://localhost:2379,http://localhost:4001
         * Group: common
         * 
         * @param uris the value to set
         * @return the dsl builder
         */
        default EtcdWatchEndpointBuilder uris(String uris) {
            doSetProperty("uris", uris);
            return this;
        }
        /**
         * To send an empty message in case of timeout watching for a key.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param sendEmptyExchangeOnTimeout the value to set
         * @return the dsl builder
         */
        default EtcdWatchEndpointBuilder sendEmptyExchangeOnTimeout(
                boolean sendEmptyExchangeOnTimeout) {
            doSetProperty("sendEmptyExchangeOnTimeout", sendEmptyExchangeOnTimeout);
            return this;
        }
        /**
         * To send an empty message in case of timeout watching for a key.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param sendEmptyExchangeOnTimeout the value to set
         * @return the dsl builder
         */
        default EtcdWatchEndpointBuilder sendEmptyExchangeOnTimeout(
                String sendEmptyExchangeOnTimeout) {
            doSetProperty("sendEmptyExchangeOnTimeout", sendEmptyExchangeOnTimeout);
            return this;
        }
        /**
         * To set the maximum time an action could take to complete.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default EtcdWatchEndpointBuilder timeout(Long timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * To set the maximum time an action could take to complete.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default EtcdWatchEndpointBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * The password to use for basic authentication.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default EtcdWatchEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default EtcdWatchEndpointBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default EtcdWatchEndpointBuilder sslContextParameters(
                String sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * The user name to use for basic authentication.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param userName the value to set
         * @return the dsl builder
         */
        default EtcdWatchEndpointBuilder userName(String userName) {
            doSetProperty("userName", userName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Etcd Watch component.
     */
    public interface AdvancedEtcdWatchEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default EtcdWatchEndpointBuilder basic() {
            return (EtcdWatchEndpointBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedEtcdWatchEndpointBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedEtcdWatchEndpointBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedEtcdWatchEndpointBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedEtcdWatchEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * The index to watch from.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 0
         * Group: consumer (advanced)
         * 
         * @param fromIndex the value to set
         * @return the dsl builder
         */
        default AdvancedEtcdWatchEndpointBuilder fromIndex(long fromIndex) {
            doSetProperty("fromIndex", fromIndex);
            return this;
        }
        /**
         * The index to watch from.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 0
         * Group: consumer (advanced)
         * 
         * @param fromIndex the value to set
         * @return the dsl builder
         */
        default AdvancedEtcdWatchEndpointBuilder fromIndex(String fromIndex) {
            doSetProperty("fromIndex", fromIndex);
            return this;
        }
    }

    public interface EtcdWatchBuilders {
        /**
         * Etcd Watch (camel-etcd)
         * Watch specific etcd keys or directories for changes.
         * 
         * Category: clustering,database
         * Since: 2.18
         * Maven coordinates: org.apache.camel:camel-etcd
         * 
         * Syntax: <code>etcd-watch:path</code>
         * 
         * Path parameter: path
         * The path the endpoint refers to
         * 
         * @param path path
         * @return the dsl builder
         */
        default EtcdWatchEndpointBuilder etcdWatch(String path) {
            return EtcdWatchEndpointBuilderFactory.endpointBuilder("etcd-watch", path);
        }
        /**
         * Etcd Watch (camel-etcd)
         * Watch specific etcd keys or directories for changes.
         * 
         * Category: clustering,database
         * Since: 2.18
         * Maven coordinates: org.apache.camel:camel-etcd
         * 
         * Syntax: <code>etcd-watch:path</code>
         * 
         * Path parameter: path
         * The path the endpoint refers to
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path path
         * @return the dsl builder
         */
        default EtcdWatchEndpointBuilder etcdWatch(
                String componentName,
                String path) {
            return EtcdWatchEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static EtcdWatchEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class EtcdWatchEndpointBuilderImpl extends AbstractEndpointBuilder implements EtcdWatchEndpointBuilder, AdvancedEtcdWatchEndpointBuilder {
            public EtcdWatchEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new EtcdWatchEndpointBuilderImpl(path);
    }
}