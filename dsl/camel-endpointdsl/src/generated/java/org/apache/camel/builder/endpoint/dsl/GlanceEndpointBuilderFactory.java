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
 * Manage VM images and metadata definitions in OpenStack Glance.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GlanceEndpointBuilderFactory {


    /**
     * Builder for endpoint for the OpenStack Glance component.
     */
    public interface GlanceEndpointBuilder extends EndpointProducerBuilder {
        /**
         * OpenStack API version.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: V3
         * Group: producer
         * 
         * @param apiVersion the value to set
         * @return the dsl builder
         */
        default GlanceEndpointBuilder apiVersion(String apiVersion) {
            doSetProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * OpenStack configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.openstack4j.core.transport.Config&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param config the value to set
         * @return the dsl builder
         */
        default GlanceEndpointBuilder config(
                org.openstack4j.core.transport.Config config) {
            doSetProperty("config", config);
            return this;
        }
        /**
         * OpenStack configuration.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.openstack4j.core.transport.Config&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param config the value to set
         * @return the dsl builder
         */
        default GlanceEndpointBuilder config(String config) {
            doSetProperty("config", config);
            return this;
        }
        /**
         * Authentication domain.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: default
         * Group: producer
         * 
         * @param domain the value to set
         * @return the dsl builder
         */
        default GlanceEndpointBuilder domain(String domain) {
            doSetProperty("domain", domain);
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
        default GlanceEndpointBuilder lazyStartProducer(
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
        default GlanceEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to do.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default GlanceEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * OpenStack password.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default GlanceEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * The project ID.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param project the value to set
         * @return the dsl builder
         */
        default GlanceEndpointBuilder project(String project) {
            doSetProperty("project", project);
            return this;
        }
        /**
         * OpenStack username.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param username the value to set
         * @return the dsl builder
         */
        default GlanceEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    public interface GlanceBuilders {
        /**
         * OpenStack Glance (camel-openstack)
         * Manage VM images and metadata definitions in OpenStack Glance.
         * 
         * Category: cloud,paas
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-openstack
         * 
         * Syntax: <code>openstack-glance:host</code>
         * 
         * Path parameter: host (required)
         * OpenStack host url
         * 
         * @param path host
         * @return the dsl builder
         */
        default GlanceEndpointBuilder openstackGlance(String path) {
            return GlanceEndpointBuilderFactory.endpointBuilder("openstack-glance", path);
        }
        /**
         * OpenStack Glance (camel-openstack)
         * Manage VM images and metadata definitions in OpenStack Glance.
         * 
         * Category: cloud,paas
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-openstack
         * 
         * Syntax: <code>openstack-glance:host</code>
         * 
         * Path parameter: host (required)
         * OpenStack host url
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path host
         * @return the dsl builder
         */
        default GlanceEndpointBuilder openstackGlance(
                String componentName,
                String path) {
            return GlanceEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static GlanceEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class GlanceEndpointBuilderImpl extends AbstractEndpointBuilder implements GlanceEndpointBuilder {
            public GlanceEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new GlanceEndpointBuilderImpl(path);
    }
}