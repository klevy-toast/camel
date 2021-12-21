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
 * Configure REST producers based on an OpenAPI specification document
 * delegating to a component implementing the RestProducerFactory interface.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface RestOpenApiEndpointBuilderFactory {


    /**
     * Builder for endpoint for the REST OpenApi component.
     */
    public interface RestOpenApiEndpointBuilder
            extends
                EndpointProducerBuilder {
        /**
         * API basePath, for example /v2. Default is unset, if set overrides the
         * value present in OpenApi specification and in the component
         * configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param basePath the value to set
         * @return the dsl builder
         */
        default RestOpenApiEndpointBuilder basePath(String basePath) {
            doSetProperty("basePath", basePath);
            return this;
        }
        /**
         * Name of the Camel component that will perform the requests. The
         * component must be present in Camel registry and it must implement
         * RestProducerFactory service provider interface. If not set CLASSPATH
         * is searched for single component that implements RestProducerFactory
         * SPI. Overrides component configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param componentName the value to set
         * @return the dsl builder
         */
        default RestOpenApiEndpointBuilder componentName(String componentName) {
            doSetProperty("componentName", componentName);
            return this;
        }
        /**
         * What payload type this component capable of consuming. Could be one
         * type, like application/json or multiple types as application/json,
         * application/xml; q=0.5 according to the RFC7231. This equates to the
         * value of Accept HTTP header. If set overrides any value found in the
         * OpenApi specification and. in the component configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param consumes the value to set
         * @return the dsl builder
         */
        default RestOpenApiEndpointBuilder consumes(String consumes) {
            doSetProperty("consumes", consumes);
            return this;
        }
        /**
         * Scheme hostname and port to direct the HTTP requests to in the form
         * of https://hostname:port. Can be configured at the endpoint,
         * component or in the corresponding REST configuration in the Camel
         * Context. If you give this component a name (e.g. petstore) that REST
         * configuration is consulted first, rest-openapi next, and global
         * configuration last. If set overrides any value found in the OpenApi
         * specification, RestConfiguration. Overrides all other configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param host the value to set
         * @return the dsl builder
         */
        default RestOpenApiEndpointBuilder host(String host) {
            doSetProperty("host", host);
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
        default RestOpenApiEndpointBuilder lazyStartProducer(
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
        default RestOpenApiEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * What payload type this component is producing. For example
         * application/json according to the RFC7231. This equates to the value
         * of Content-Type HTTP header. If set overrides any value present in
         * the OpenApi specification. Overrides all other configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param produces the value to set
         * @return the dsl builder
         */
        default RestOpenApiEndpointBuilder produces(String produces) {
            doSetProperty("produces", produces);
            return this;
        }
    }

    public interface RestOpenApiBuilders {
        /**
         * REST OpenApi (camel-rest-openapi)
         * Configure REST producers based on an OpenAPI specification document
         * delegating to a component implementing the RestProducerFactory
         * interface.
         * 
         * Category: openapi,rest,api
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-rest-openapi
         * 
         * Syntax: <code>rest-openapi:specificationUri#operationId</code>
         * 
         * Path parameter: specificationUri
         * Path to the OpenApi specification file. The scheme, host base path
         * are taken from this specification, but these can be overridden with
         * properties on the component or endpoint level. If not given the
         * component tries to load openapi.json resource from the classpath.
         * Note that the host defined on the component and endpoint of this
         * Component should contain the scheme, hostname and optionally the port
         * in the URI syntax (i.e. http://api.example.com:8080). Overrides
         * component configuration. The OpenApi specification can be loaded from
         * different sources by prefixing with file: classpath: http: https:.
         * Support for https is limited to using the JDK installed UrlHandler,
         * and as such it can be cumbersome to setup TLS/SSL certificates for
         * https (such as setting a number of javax.net.ssl JVM system
         * properties). How to do that consult the JDK documentation for
         * UrlHandler. Default value notice: By default loads openapi.json file
         * Default value: openapi.json
         * 
         * Path parameter: operationId (required)
         * ID of the operation from the OpenApi specification.
         * 
         * @param path specificationUri#operationId
         * @return the dsl builder
         */
        default RestOpenApiEndpointBuilder restOpenapi(String path) {
            return RestOpenApiEndpointBuilderFactory.endpointBuilder("rest-openapi", path);
        }
        /**
         * REST OpenApi (camel-rest-openapi)
         * Configure REST producers based on an OpenAPI specification document
         * delegating to a component implementing the RestProducerFactory
         * interface.
         * 
         * Category: openapi,rest,api
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-rest-openapi
         * 
         * Syntax: <code>rest-openapi:specificationUri#operationId</code>
         * 
         * Path parameter: specificationUri
         * Path to the OpenApi specification file. The scheme, host base path
         * are taken from this specification, but these can be overridden with
         * properties on the component or endpoint level. If not given the
         * component tries to load openapi.json resource from the classpath.
         * Note that the host defined on the component and endpoint of this
         * Component should contain the scheme, hostname and optionally the port
         * in the URI syntax (i.e. http://api.example.com:8080). Overrides
         * component configuration. The OpenApi specification can be loaded from
         * different sources by prefixing with file: classpath: http: https:.
         * Support for https is limited to using the JDK installed UrlHandler,
         * and as such it can be cumbersome to setup TLS/SSL certificates for
         * https (such as setting a number of javax.net.ssl JVM system
         * properties). How to do that consult the JDK documentation for
         * UrlHandler. Default value notice: By default loads openapi.json file
         * Default value: openapi.json
         * 
         * Path parameter: operationId (required)
         * ID of the operation from the OpenApi specification.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path specificationUri#operationId
         * @return the dsl builder
         */
        default RestOpenApiEndpointBuilder restOpenapi(
                String componentName,
                String path) {
            return RestOpenApiEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static RestOpenApiEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class RestOpenApiEndpointBuilderImpl extends AbstractEndpointBuilder implements RestOpenApiEndpointBuilder {
            public RestOpenApiEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new RestOpenApiEndpointBuilderImpl(path);
    }
}