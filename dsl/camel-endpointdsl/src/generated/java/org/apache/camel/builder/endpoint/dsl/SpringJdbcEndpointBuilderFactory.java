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
import java.util.Map;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Access databases through SQL and JDBC with Spring Transaction support.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SpringJdbcEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Spring JDBC component.
     */
    public interface SpringJdbcEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedSpringJdbcEndpointBuilder advanced() {
            return (AdvancedSpringJdbcEndpointBuilder) this;
        }
        /**
         * Whether to allow using named parameters in the queries.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param allowNamedParameters the value to set
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder allowNamedParameters(
                boolean allowNamedParameters) {
            doSetProperty("allowNamedParameters", allowNamedParameters);
            return this;
        }
        /**
         * Whether to allow using named parameters in the queries.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param allowNamedParameters the value to set
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder allowNamedParameters(
                String allowNamedParameters) {
            doSetProperty("allowNamedParameters", allowNamedParameters);
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
        default SpringJdbcEndpointBuilder lazyStartProducer(
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
        default SpringJdbcEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Specify the full package and class name to use as conversion when
         * outputType=SelectOne or SelectList.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param outputClass the value to set
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder outputClass(String outputClass) {
            doSetProperty("outputClass", outputClass);
            return this;
        }
        /**
         * Determines the output the producer should use.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.jdbc.JdbcOutputType&lt;/code&gt; type.
         * 
         * Default: SelectList
         * Group: producer
         * 
         * @param outputType the value to set
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder outputType(
                org.apache.camel.component.jdbc.JdbcOutputType outputType) {
            doSetProperty("outputType", outputType);
            return this;
        }
        /**
         * Determines the output the producer should use.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.jdbc.JdbcOutputType&lt;/code&gt; type.
         * 
         * Default: SelectList
         * Group: producer
         * 
         * @param outputType the value to set
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder outputType(String outputType) {
            doSetProperty("outputType", outputType);
            return this;
        }
        /**
         * Optional parameters to the java.sql.Statement. For example to set
         * maxRows, fetchSize etc.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the parameters(String,
         * Object) method to add a value (call the method multiple times to set
         * more values).
         * 
         * Group: producer
         * 
         * @param key the option key
         * @param value the option value
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder parameters(String key, Object value) {
            doSetMultiValueProperty("parameters", "statement." + key, value);
            return this;
        }
        /**
         * Optional parameters to the java.sql.Statement. For example to set
         * maxRows, fetchSize etc.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the parameters(String,
         * Object) method to add a value (call the method multiple times to set
         * more values).
         * 
         * Group: producer
         * 
         * @param values the values
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder parameters(Map values) {
            doSetMultiValueProperties("parameters", "statement.", values);
            return this;
        }
        /**
         * The default maximum number of rows that can be read by a polling
         * query. The default value is 0.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param readSize the value to set
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder readSize(int readSize) {
            doSetProperty("readSize", readSize);
            return this;
        }
        /**
         * The default maximum number of rows that can be read by a polling
         * query. The default value is 0.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param readSize the value to set
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder readSize(String readSize) {
            doSetProperty("readSize", readSize);
            return this;
        }
        /**
         * Camel will set the autoCommit on the JDBC connection to be false,
         * commit the change after executed the statement and reset the
         * autoCommit flag of the connection at the end, if the resetAutoCommit
         * is true. If the JDBC connection doesn't support to reset the
         * autoCommit flag, you can set the resetAutoCommit flag to be false,
         * and Camel will not try to reset the autoCommit flag. When used with
         * XA transactions you most likely need to set it to false so that the
         * transaction manager is in charge of committing this tx.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param resetAutoCommit the value to set
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder resetAutoCommit(
                boolean resetAutoCommit) {
            doSetProperty("resetAutoCommit", resetAutoCommit);
            return this;
        }
        /**
         * Camel will set the autoCommit on the JDBC connection to be false,
         * commit the change after executed the statement and reset the
         * autoCommit flag of the connection at the end, if the resetAutoCommit
         * is true. If the JDBC connection doesn't support to reset the
         * autoCommit flag, you can set the resetAutoCommit flag to be false,
         * and Camel will not try to reset the autoCommit flag. When used with
         * XA transactions you most likely need to set it to false so that the
         * transaction manager is in charge of committing this tx.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param resetAutoCommit the value to set
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder resetAutoCommit(String resetAutoCommit) {
            doSetProperty("resetAutoCommit", resetAutoCommit);
            return this;
        }
        /**
         * Whether transactions are in use.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param transacted the value to set
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder transacted(boolean transacted) {
            doSetProperty("transacted", transacted);
            return this;
        }
        /**
         * Whether transactions are in use.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param transacted the value to set
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder transacted(String transacted) {
            doSetProperty("transacted", transacted);
            return this;
        }
        /**
         * To read BLOB columns as bytes instead of string data. This may be
         * needed for certain databases such as Oracle where you must read BLOB
         * columns as bytes.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useGetBytesForBlob the value to set
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder useGetBytesForBlob(
                boolean useGetBytesForBlob) {
            doSetProperty("useGetBytesForBlob", useGetBytesForBlob);
            return this;
        }
        /**
         * To read BLOB columns as bytes instead of string data. This may be
         * needed for certain databases such as Oracle where you must read BLOB
         * columns as bytes.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useGetBytesForBlob the value to set
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder useGetBytesForBlob(
                String useGetBytesForBlob) {
            doSetProperty("useGetBytesForBlob", useGetBytesForBlob);
            return this;
        }
        /**
         * Set this option to true to use the prepareStatementStrategy with
         * named parameters. This allows to define queries with named
         * placeholders, and use headers with the dynamic values for the query
         * placeholders.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useHeadersAsParameters the value to set
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder useHeadersAsParameters(
                boolean useHeadersAsParameters) {
            doSetProperty("useHeadersAsParameters", useHeadersAsParameters);
            return this;
        }
        /**
         * Set this option to true to use the prepareStatementStrategy with
         * named parameters. This allows to define queries with named
         * placeholders, and use headers with the dynamic values for the query
         * placeholders.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useHeadersAsParameters the value to set
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder useHeadersAsParameters(
                String useHeadersAsParameters) {
            doSetProperty("useHeadersAsParameters", useHeadersAsParameters);
            return this;
        }
        /**
         * Sets whether to use JDBC 4 or JDBC 3.0 or older semantic when
         * retrieving column name. JDBC 4.0 uses columnLabel to get the column
         * name where as JDBC 3.0 uses both columnName or columnLabel.
         * Unfortunately JDBC drivers behave differently so you can use this
         * option to work out issues around your JDBC driver if you get problem
         * using this component This option is default true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param useJDBC4ColumnNameAndLabelSemantics the value to set
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder useJDBC4ColumnNameAndLabelSemantics(
                boolean useJDBC4ColumnNameAndLabelSemantics) {
            doSetProperty("useJDBC4ColumnNameAndLabelSemantics", useJDBC4ColumnNameAndLabelSemantics);
            return this;
        }
        /**
         * Sets whether to use JDBC 4 or JDBC 3.0 or older semantic when
         * retrieving column name. JDBC 4.0 uses columnLabel to get the column
         * name where as JDBC 3.0 uses both columnName or columnLabel.
         * Unfortunately JDBC drivers behave differently so you can use this
         * option to work out issues around your JDBC driver if you get problem
         * using this component This option is default true.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param useJDBC4ColumnNameAndLabelSemantics the value to set
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder useJDBC4ColumnNameAndLabelSemantics(
                String useJDBC4ColumnNameAndLabelSemantics) {
            doSetProperty("useJDBC4ColumnNameAndLabelSemantics", useJDBC4ColumnNameAndLabelSemantics);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Spring JDBC component.
     */
    public interface AdvancedSpringJdbcEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SpringJdbcEndpointBuilder basic() {
            return (SpringJdbcEndpointBuilder) this;
        }
        /**
         * To use a custom org.apache.camel.component.jdbc.BeanRowMapper when
         * using outputClass. The default implementation will lower case the row
         * names and skip underscores, and dashes. For example CUST_ID is mapped
         * as custId.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.jdbc.BeanRowMapper&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param beanRowMapper the value to set
         * @return the dsl builder
         */
        default AdvancedSpringJdbcEndpointBuilder beanRowMapper(
                org.apache.camel.component.jdbc.BeanRowMapper beanRowMapper) {
            doSetProperty("beanRowMapper", beanRowMapper);
            return this;
        }
        /**
         * To use a custom org.apache.camel.component.jdbc.BeanRowMapper when
         * using outputClass. The default implementation will lower case the row
         * names and skip underscores, and dashes. For example CUST_ID is mapped
         * as custId.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.jdbc.BeanRowMapper&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param beanRowMapper the value to set
         * @return the dsl builder
         */
        default AdvancedSpringJdbcEndpointBuilder beanRowMapper(
                String beanRowMapper) {
            doSetProperty("beanRowMapper", beanRowMapper);
            return this;
        }
        /**
         * To use a custom strategy for working with connections. Do not use a
         * custom strategy when using the spring-jdbc component because a
         * special Spring ConnectionStrategy is used by default to support
         * Spring Transactions.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.jdbc.ConnectionStrategy&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param connectionStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedSpringJdbcEndpointBuilder connectionStrategy(
                org.apache.camel.component.jdbc.ConnectionStrategy connectionStrategy) {
            doSetProperty("connectionStrategy", connectionStrategy);
            return this;
        }
        /**
         * To use a custom strategy for working with connections. Do not use a
         * custom strategy when using the spring-jdbc component because a
         * special Spring ConnectionStrategy is used by default to support
         * Spring Transactions.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.jdbc.ConnectionStrategy&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param connectionStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedSpringJdbcEndpointBuilder connectionStrategy(
                String connectionStrategy) {
            doSetProperty("connectionStrategy", connectionStrategy);
            return this;
        }
        /**
         * Allows the plugin to use a custom
         * org.apache.camel.component.jdbc.JdbcPrepareStatementStrategy to
         * control preparation of the query and prepared statement.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.jdbc.JdbcPrepareStatementStrategy&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param prepareStatementStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedSpringJdbcEndpointBuilder prepareStatementStrategy(
                org.apache.camel.component.jdbc.JdbcPrepareStatementStrategy prepareStatementStrategy) {
            doSetProperty("prepareStatementStrategy", prepareStatementStrategy);
            return this;
        }
        /**
         * Allows the plugin to use a custom
         * org.apache.camel.component.jdbc.JdbcPrepareStatementStrategy to
         * control preparation of the query and prepared statement.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.jdbc.JdbcPrepareStatementStrategy&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param prepareStatementStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedSpringJdbcEndpointBuilder prepareStatementStrategy(
                String prepareStatementStrategy) {
            doSetProperty("prepareStatementStrategy", prepareStatementStrategy);
            return this;
        }
    }

    public interface SpringJdbcBuilders {
        /**
         * Spring JDBC (camel-spring-jdbc)
         * Access databases through SQL and JDBC with Spring Transaction
         * support.
         * 
         * Category: database,sql
         * Since: 3.10
         * Maven coordinates: org.apache.camel:camel-spring-jdbc
         * 
         * Syntax: <code>spring-jdbc:dataSourceName</code>
         * 
         * Path parameter: dataSourceName (required)
         * Name of DataSource to lookup in the Registry. If the name is
         * dataSource or default, then Camel will attempt to lookup a default
         * DataSource from the registry, meaning if there is a only one instance
         * of DataSource found, then this DataSource will be used.
         * 
         * @param path dataSourceName
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder springJdbc(String path) {
            return SpringJdbcEndpointBuilderFactory.endpointBuilder("spring-jdbc", path);
        }
        /**
         * Spring JDBC (camel-spring-jdbc)
         * Access databases through SQL and JDBC with Spring Transaction
         * support.
         * 
         * Category: database,sql
         * Since: 3.10
         * Maven coordinates: org.apache.camel:camel-spring-jdbc
         * 
         * Syntax: <code>spring-jdbc:dataSourceName</code>
         * 
         * Path parameter: dataSourceName (required)
         * Name of DataSource to lookup in the Registry. If the name is
         * dataSource or default, then Camel will attempt to lookup a default
         * DataSource from the registry, meaning if there is a only one instance
         * of DataSource found, then this DataSource will be used.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path dataSourceName
         * @return the dsl builder
         */
        default SpringJdbcEndpointBuilder springJdbc(
                String componentName,
                String path) {
            return SpringJdbcEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static SpringJdbcEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class SpringJdbcEndpointBuilderImpl extends AbstractEndpointBuilder implements SpringJdbcEndpointBuilder, AdvancedSpringJdbcEndpointBuilder {
            public SpringJdbcEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new SpringJdbcEndpointBuilderImpl(path);
    }
}