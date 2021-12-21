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
 * Consume changesets for inserts, updates and deletes in a CouchDB database, as
 * well as get, save, update and delete documents from a CouchDB database.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CouchDbEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the CouchDB component.
     */
    public interface CouchDbEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedCouchDbEndpointConsumerBuilder advanced() {
            return (AdvancedCouchDbEndpointConsumerBuilder) this;
        }
        /**
         * Creates the database if it does not already exist.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param createDatabase the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointConsumerBuilder createDatabase(
                boolean createDatabase) {
            doSetProperty("createDatabase", createDatabase);
            return this;
        }
        /**
         * Creates the database if it does not already exist.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param createDatabase the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointConsumerBuilder createDatabase(
                String createDatabase) {
            doSetProperty("createDatabase", createDatabase);
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
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointConsumerBuilder bridgeErrorHandler(
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
        default CouchDbEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Document deletes are published as events.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param deletes the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointConsumerBuilder deletes(boolean deletes) {
            doSetProperty("deletes", deletes);
            return this;
        }
        /**
         * Document deletes are published as events.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param deletes the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointConsumerBuilder deletes(String deletes) {
            doSetProperty("deletes", deletes);
            return this;
        }
        /**
         * How often to send an empty message to keep socket alive in millis.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 30000
         * Group: consumer
         * 
         * @param heartbeat the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointConsumerBuilder heartbeat(long heartbeat) {
            doSetProperty("heartbeat", heartbeat);
            return this;
        }
        /**
         * How often to send an empty message to keep socket alive in millis.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 30000
         * Group: consumer
         * 
         * @param heartbeat the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointConsumerBuilder heartbeat(String heartbeat) {
            doSetProperty("heartbeat", heartbeat);
            return this;
        }
        /**
         * Sets a custom resume strategy for tracking changes from CouchDB. It
         * allows tracking from a specific point (i.e.: since the given update
         * sequence, the latest sequence, etc).
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.couchdb.consumer.CouchDbResumeStrategy&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param resumeStrategy the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointConsumerBuilder resumeStrategy(
                org.apache.camel.component.couchdb.consumer.CouchDbResumeStrategy resumeStrategy) {
            doSetProperty("resumeStrategy", resumeStrategy);
            return this;
        }
        /**
         * Sets a custom resume strategy for tracking changes from CouchDB. It
         * allows tracking from a specific point (i.e.: since the given update
         * sequence, the latest sequence, etc).
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.couchdb.consumer.CouchDbResumeStrategy&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param resumeStrategy the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointConsumerBuilder resumeStrategy(
                String resumeStrategy) {
            doSetProperty("resumeStrategy", resumeStrategy);
            return this;
        }
        /**
         * Specifies how many revisions are returned in the changes array. The
         * default, main_only, will only return the current winning revision;
         * all_docs will return all leaf revisions (including conflicts and
         * deleted former conflicts.).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: main_only
         * Group: consumer
         * 
         * @param style the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointConsumerBuilder style(String style) {
            doSetProperty("style", style);
            return this;
        }
        /**
         * Document inserts/updates are published as events.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param updates the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointConsumerBuilder updates(boolean updates) {
            doSetProperty("updates", updates);
            return this;
        }
        /**
         * Document inserts/updates are published as events.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param updates the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointConsumerBuilder updates(String updates) {
            doSetProperty("updates", updates);
            return this;
        }
        /**
         * Password for authenticated databases.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointConsumerBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Username in case of authenticated databases.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param username the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointConsumerBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the CouchDB component.
     */
    public interface AdvancedCouchDbEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default CouchDbEndpointConsumerBuilder basic() {
            return (CouchDbEndpointConsumerBuilder) this;
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
        default AdvancedCouchDbEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedCouchDbEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedCouchDbEndpointConsumerBuilder exchangePattern(
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
        default AdvancedCouchDbEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the CouchDB component.
     */
    public interface CouchDbEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedCouchDbEndpointProducerBuilder advanced() {
            return (AdvancedCouchDbEndpointProducerBuilder) this;
        }
        /**
         * Creates the database if it does not already exist.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param createDatabase the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointProducerBuilder createDatabase(
                boolean createDatabase) {
            doSetProperty("createDatabase", createDatabase);
            return this;
        }
        /**
         * Creates the database if it does not already exist.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param createDatabase the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointProducerBuilder createDatabase(
                String createDatabase) {
            doSetProperty("createDatabase", createDatabase);
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
        default CouchDbEndpointProducerBuilder lazyStartProducer(
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
        default CouchDbEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Password for authenticated databases.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointProducerBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Username in case of authenticated databases.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param username the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointProducerBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the CouchDB component.
     */
    public interface AdvancedCouchDbEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default CouchDbEndpointProducerBuilder basic() {
            return (CouchDbEndpointProducerBuilder) this;
        }
    }

    /**
     * Builder for endpoint for the CouchDB component.
     */
    public interface CouchDbEndpointBuilder
            extends
                CouchDbEndpointConsumerBuilder,
                CouchDbEndpointProducerBuilder {
        default AdvancedCouchDbEndpointBuilder advanced() {
            return (AdvancedCouchDbEndpointBuilder) this;
        }
        /**
         * Creates the database if it does not already exist.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param createDatabase the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointBuilder createDatabase(boolean createDatabase) {
            doSetProperty("createDatabase", createDatabase);
            return this;
        }
        /**
         * Creates the database if it does not already exist.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param createDatabase the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointBuilder createDatabase(String createDatabase) {
            doSetProperty("createDatabase", createDatabase);
            return this;
        }
        /**
         * Password for authenticated databases.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Username in case of authenticated databases.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param username the value to set
         * @return the dsl builder
         */
        default CouchDbEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the CouchDB component.
     */
    public interface AdvancedCouchDbEndpointBuilder
            extends
                AdvancedCouchDbEndpointConsumerBuilder,
                AdvancedCouchDbEndpointProducerBuilder {
        default CouchDbEndpointBuilder basic() {
            return (CouchDbEndpointBuilder) this;
        }
    }

    public interface CouchDbBuilders {
        /**
         * CouchDB (camel-couchdb)
         * Consume changesets for inserts, updates and deletes in a CouchDB
         * database, as well as get, save, update and delete documents from a
         * CouchDB database.
         * 
         * Category: database,nosql
         * Since: 2.11
         * Maven coordinates: org.apache.camel:camel-couchdb
         * 
         * Syntax: <code>couchdb:protocol:hostname:port/database</code>
         * 
         * Path parameter: protocol (required)
         * The protocol to use for communicating with the database.
         * There are 2 enums and the value can be one of: http, https
         * 
         * Path parameter: hostname (required)
         * Hostname of the running couchdb instance
         * 
         * Path parameter: port
         * Port number for the running couchdb instance
         * Default value: 5984
         * 
         * Path parameter: database (required)
         * Name of the database to use
         * 
         * @param path protocol:hostname:port/database
         * @return the dsl builder
         */
        default CouchDbEndpointBuilder couchdb(String path) {
            return CouchDbEndpointBuilderFactory.endpointBuilder("couchdb", path);
        }
        /**
         * CouchDB (camel-couchdb)
         * Consume changesets for inserts, updates and deletes in a CouchDB
         * database, as well as get, save, update and delete documents from a
         * CouchDB database.
         * 
         * Category: database,nosql
         * Since: 2.11
         * Maven coordinates: org.apache.camel:camel-couchdb
         * 
         * Syntax: <code>couchdb:protocol:hostname:port/database</code>
         * 
         * Path parameter: protocol (required)
         * The protocol to use for communicating with the database.
         * There are 2 enums and the value can be one of: http, https
         * 
         * Path parameter: hostname (required)
         * Hostname of the running couchdb instance
         * 
         * Path parameter: port
         * Port number for the running couchdb instance
         * Default value: 5984
         * 
         * Path parameter: database (required)
         * Name of the database to use
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path protocol:hostname:port/database
         * @return the dsl builder
         */
        default CouchDbEndpointBuilder couchdb(String componentName, String path) {
            return CouchDbEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static CouchDbEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class CouchDbEndpointBuilderImpl extends AbstractEndpointBuilder implements CouchDbEndpointBuilder, AdvancedCouchDbEndpointBuilder {
            public CouchDbEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new CouchDbEndpointBuilderImpl(path);
    }
}