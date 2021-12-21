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
 * Chat with a ChatScript Server.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ChatScriptEndpointBuilderFactory {


    /**
     * Builder for endpoint for the ChatScript component.
     */
    public interface ChatScriptEndpointBuilder
            extends
                EndpointProducerBuilder {
        /**
         * Username who initializes the CS conversation. To be set when chat is
         * initialized from camel route.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param chatUserName the value to set
         * @return the dsl builder
         */
        default ChatScriptEndpointBuilder chatUserName(String chatUserName) {
            doSetProperty("chatUserName", chatUserName);
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
        default ChatScriptEndpointBuilder lazyStartProducer(
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
        default ChatScriptEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Issues :reset command to start a new conversation everytime.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param resetChat the value to set
         * @return the dsl builder
         */
        default ChatScriptEndpointBuilder resetChat(boolean resetChat) {
            doSetProperty("resetChat", resetChat);
            return this;
        }
        /**
         * Issues :reset command to start a new conversation everytime.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param resetChat the value to set
         * @return the dsl builder
         */
        default ChatScriptEndpointBuilder resetChat(String resetChat) {
            doSetProperty("resetChat", resetChat);
            return this;
        }
    }

    public interface ChatScriptBuilders {
        /**
         * ChatScript (camel-chatscript)
         * Chat with a ChatScript Server.
         * 
         * Category: ai,chat
         * Since: 3.0
         * Maven coordinates: org.apache.camel:camel-chatscript
         * 
         * Syntax: <code>chatscript:host:port/botName</code>
         * 
         * Path parameter: host (required)
         * Hostname or IP of the server on which CS server is running
         * 
         * Path parameter: port
         * Port on which ChatScript is listening to
         * Default value: 1024
         * 
         * Path parameter: botName (required)
         * Name of the Bot in CS to converse with
         * 
         * @param path host:port/botName
         * @return the dsl builder
         */
        default ChatScriptEndpointBuilder chatscript(String path) {
            return ChatScriptEndpointBuilderFactory.endpointBuilder("chatscript", path);
        }
        /**
         * ChatScript (camel-chatscript)
         * Chat with a ChatScript Server.
         * 
         * Category: ai,chat
         * Since: 3.0
         * Maven coordinates: org.apache.camel:camel-chatscript
         * 
         * Syntax: <code>chatscript:host:port/botName</code>
         * 
         * Path parameter: host (required)
         * Hostname or IP of the server on which CS server is running
         * 
         * Path parameter: port
         * Port on which ChatScript is listening to
         * Default value: 1024
         * 
         * Path parameter: botName (required)
         * Name of the Bot in CS to converse with
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path host:port/botName
         * @return the dsl builder
         */
        default ChatScriptEndpointBuilder chatscript(
                String componentName,
                String path) {
            return ChatScriptEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static ChatScriptEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class ChatScriptEndpointBuilderImpl extends AbstractEndpointBuilder implements ChatScriptEndpointBuilder {
            public ChatScriptEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new ChatScriptEndpointBuilderImpl(path);
    }
}