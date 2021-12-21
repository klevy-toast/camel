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
 * Upload, download and manage files, folders, groups, collaborations, etc on
 * Dropbox.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DropboxEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Dropbox component.
     */
    public interface DropboxEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedDropboxEndpointConsumerBuilder advanced() {
            return (AdvancedDropboxEndpointConsumerBuilder) this;
        }
        /**
         * The access token to make API requests for a specific Dropbox user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param accessToken the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder accessToken(String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * To use an existing DbxClient instance as DropBox client.
         * 
         * The option is a:
         * &lt;code&gt;com.dropbox.core.v2.DbxClientV2&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param client the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder client(
                com.dropbox.core.v2.DbxClientV2 client) {
            doSetProperty("client", client);
            return this;
        }
        /**
         * To use an existing DbxClient instance as DropBox client.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.dropbox.core.v2.DbxClientV2&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param client the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder client(String client) {
            doSetProperty("client", client);
            return this;
        }
        /**
         * Name of the app registered to make API requests.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param clientIdentifier the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder clientIdentifier(
                String clientIdentifier) {
            doSetProperty("clientIdentifier", clientIdentifier);
            return this;
        }
        /**
         * Optional folder or file to upload on Dropbox from the local
         * filesystem. If this option has not been configured then the message
         * body is used as the content to upload.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param localPath the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder localPath(String localPath) {
            doSetProperty("localPath", localPath);
            return this;
        }
        /**
         * Destination file or folder.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param newRemotePath the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder newRemotePath(
                String newRemotePath) {
            doSetProperty("newRemotePath", newRemotePath);
            return this;
        }
        /**
         * A space-separated list of sub-strings to search for. A file matches
         * only if it contains all the sub-strings. If this option is not set,
         * all files will be matched.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param query the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder query(String query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * Original file or folder to move.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param remotePath the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder remotePath(String remotePath) {
            doSetProperty("remotePath", remotePath);
            return this;
        }
        /**
         * Which mode to upload. in case of add the new file will be renamed if
         * a file with the same name already exists on dropbox. in case of force
         * if a file with the same name already exists on dropbox, this will be
         * overwritten.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.dropbox.util.DropboxUploadMode&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param uploadMode the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder uploadMode(
                org.apache.camel.component.dropbox.util.DropboxUploadMode uploadMode) {
            doSetProperty("uploadMode", uploadMode);
            return this;
        }
        /**
         * Which mode to upload. in case of add the new file will be renamed if
         * a file with the same name already exists on dropbox. in case of force
         * if a file with the same name already exists on dropbox, this will be
         * overwritten.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.dropbox.util.DropboxUploadMode&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param uploadMode the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder uploadMode(String uploadMode) {
            doSetProperty("uploadMode", uploadMode);
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
        default DropboxEndpointConsumerBuilder bridgeErrorHandler(
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
        default DropboxEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Dropbox component.
     */
    public interface AdvancedDropboxEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default DropboxEndpointConsumerBuilder basic() {
            return (DropboxEndpointConsumerBuilder) this;
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
        default AdvancedDropboxEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedDropboxEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedDropboxEndpointConsumerBuilder exchangePattern(
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
        default AdvancedDropboxEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Dropbox component.
     */
    public interface DropboxEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedDropboxEndpointProducerBuilder advanced() {
            return (AdvancedDropboxEndpointProducerBuilder) this;
        }
        /**
         * The access token to make API requests for a specific Dropbox user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param accessToken the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder accessToken(String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * To use an existing DbxClient instance as DropBox client.
         * 
         * The option is a:
         * &lt;code&gt;com.dropbox.core.v2.DbxClientV2&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param client the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder client(
                com.dropbox.core.v2.DbxClientV2 client) {
            doSetProperty("client", client);
            return this;
        }
        /**
         * To use an existing DbxClient instance as DropBox client.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.dropbox.core.v2.DbxClientV2&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param client the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder client(String client) {
            doSetProperty("client", client);
            return this;
        }
        /**
         * Name of the app registered to make API requests.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param clientIdentifier the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder clientIdentifier(
                String clientIdentifier) {
            doSetProperty("clientIdentifier", clientIdentifier);
            return this;
        }
        /**
         * Optional folder or file to upload on Dropbox from the local
         * filesystem. If this option has not been configured then the message
         * body is used as the content to upload.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param localPath the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder localPath(String localPath) {
            doSetProperty("localPath", localPath);
            return this;
        }
        /**
         * Destination file or folder.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param newRemotePath the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder newRemotePath(
                String newRemotePath) {
            doSetProperty("newRemotePath", newRemotePath);
            return this;
        }
        /**
         * A space-separated list of sub-strings to search for. A file matches
         * only if it contains all the sub-strings. If this option is not set,
         * all files will be matched.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param query the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder query(String query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * Original file or folder to move.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param remotePath the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder remotePath(String remotePath) {
            doSetProperty("remotePath", remotePath);
            return this;
        }
        /**
         * Which mode to upload. in case of add the new file will be renamed if
         * a file with the same name already exists on dropbox. in case of force
         * if a file with the same name already exists on dropbox, this will be
         * overwritten.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.dropbox.util.DropboxUploadMode&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param uploadMode the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder uploadMode(
                org.apache.camel.component.dropbox.util.DropboxUploadMode uploadMode) {
            doSetProperty("uploadMode", uploadMode);
            return this;
        }
        /**
         * Which mode to upload. in case of add the new file will be renamed if
         * a file with the same name already exists on dropbox. in case of force
         * if a file with the same name already exists on dropbox, this will be
         * overwritten.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.dropbox.util.DropboxUploadMode&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param uploadMode the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder uploadMode(String uploadMode) {
            doSetProperty("uploadMode", uploadMode);
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
        default DropboxEndpointProducerBuilder lazyStartProducer(
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
        default DropboxEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Dropbox component.
     */
    public interface AdvancedDropboxEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default DropboxEndpointProducerBuilder basic() {
            return (DropboxEndpointProducerBuilder) this;
        }
    }

    /**
     * Builder for endpoint for the Dropbox component.
     */
    public interface DropboxEndpointBuilder
            extends
                DropboxEndpointConsumerBuilder,
                DropboxEndpointProducerBuilder {
        default AdvancedDropboxEndpointBuilder advanced() {
            return (AdvancedDropboxEndpointBuilder) this;
        }
        /**
         * The access token to make API requests for a specific Dropbox user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param accessToken the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder accessToken(String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * To use an existing DbxClient instance as DropBox client.
         * 
         * The option is a:
         * &lt;code&gt;com.dropbox.core.v2.DbxClientV2&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param client the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder client(
                com.dropbox.core.v2.DbxClientV2 client) {
            doSetProperty("client", client);
            return this;
        }
        /**
         * To use an existing DbxClient instance as DropBox client.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.dropbox.core.v2.DbxClientV2&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param client the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder client(String client) {
            doSetProperty("client", client);
            return this;
        }
        /**
         * Name of the app registered to make API requests.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param clientIdentifier the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder clientIdentifier(String clientIdentifier) {
            doSetProperty("clientIdentifier", clientIdentifier);
            return this;
        }
        /**
         * Optional folder or file to upload on Dropbox from the local
         * filesystem. If this option has not been configured then the message
         * body is used as the content to upload.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param localPath the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder localPath(String localPath) {
            doSetProperty("localPath", localPath);
            return this;
        }
        /**
         * Destination file or folder.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param newRemotePath the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder newRemotePath(String newRemotePath) {
            doSetProperty("newRemotePath", newRemotePath);
            return this;
        }
        /**
         * A space-separated list of sub-strings to search for. A file matches
         * only if it contains all the sub-strings. If this option is not set,
         * all files will be matched.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param query the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder query(String query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * Original file or folder to move.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param remotePath the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder remotePath(String remotePath) {
            doSetProperty("remotePath", remotePath);
            return this;
        }
        /**
         * Which mode to upload. in case of add the new file will be renamed if
         * a file with the same name already exists on dropbox. in case of force
         * if a file with the same name already exists on dropbox, this will be
         * overwritten.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.dropbox.util.DropboxUploadMode&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param uploadMode the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder uploadMode(
                org.apache.camel.component.dropbox.util.DropboxUploadMode uploadMode) {
            doSetProperty("uploadMode", uploadMode);
            return this;
        }
        /**
         * Which mode to upload. in case of add the new file will be renamed if
         * a file with the same name already exists on dropbox. in case of force
         * if a file with the same name already exists on dropbox, this will be
         * overwritten.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.dropbox.util.DropboxUploadMode&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param uploadMode the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder uploadMode(String uploadMode) {
            doSetProperty("uploadMode", uploadMode);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Dropbox component.
     */
    public interface AdvancedDropboxEndpointBuilder
            extends
                AdvancedDropboxEndpointConsumerBuilder,
                AdvancedDropboxEndpointProducerBuilder {
        default DropboxEndpointBuilder basic() {
            return (DropboxEndpointBuilder) this;
        }
    }

    public interface DropboxBuilders {
        /**
         * Dropbox (camel-dropbox)
         * Upload, download and manage files, folders, groups, collaborations,
         * etc on Dropbox.
         * 
         * Category: cloud,file,api
         * Since: 2.14
         * Maven coordinates: org.apache.camel:camel-dropbox
         * 
         * Syntax: <code>dropbox:operation</code>
         * 
         * Path parameter: operation (required)
         * The specific action (typically is a CRUD action) to perform on
         * Dropbox remote folder.
         * There are 5 enums and the value can be one of: put, del, search, get,
         * move
         * 
         * @param path operation
         * @return the dsl builder
         */
        default DropboxEndpointBuilder dropbox(String path) {
            return DropboxEndpointBuilderFactory.endpointBuilder("dropbox", path);
        }
        /**
         * Dropbox (camel-dropbox)
         * Upload, download and manage files, folders, groups, collaborations,
         * etc on Dropbox.
         * 
         * Category: cloud,file,api
         * Since: 2.14
         * Maven coordinates: org.apache.camel:camel-dropbox
         * 
         * Syntax: <code>dropbox:operation</code>
         * 
         * Path parameter: operation (required)
         * The specific action (typically is a CRUD action) to perform on
         * Dropbox remote folder.
         * There are 5 enums and the value can be one of: put, del, search, get,
         * move
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path operation
         * @return the dsl builder
         */
        default DropboxEndpointBuilder dropbox(String componentName, String path) {
            return DropboxEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static DropboxEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class DropboxEndpointBuilderImpl extends AbstractEndpointBuilder implements DropboxEndpointBuilder, AdvancedDropboxEndpointBuilder {
            public DropboxEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new DropboxEndpointBuilderImpl(path);
    }
}