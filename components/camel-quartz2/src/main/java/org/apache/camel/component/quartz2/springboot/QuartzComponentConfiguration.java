/**
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
package org.apache.camel.component.quartz2.springboot;

import java.util.Properties;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Provides a scheduled delivery of messages using the Quartz 2.x scheduler.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.quartz2")
public class QuartzComponentConfiguration {

    /**
     * Whether or not the scheduler should be auto started. This options is
     * default true
     */
    private Boolean autoStartScheduler = false;
    /**
     * Seconds to wait before starting the quartz scheduler.
     */
    private int startDelayedSeconds;
    /**
     * Whether to prefix the quartz job with the endpoint id. This option is
     * default false.
     */
    private Boolean prefixJobNameWithEndpointId = false;
    /**
     * Whether to enable Quartz JMX which allows to manage the Quartz scheduler
     * from JMX. This options is default true
     */
    private Boolean enableJmx = false;
    /**
     * Properties to configure the Quartz scheduler.
     */
    private Properties properties;
    /**
     * File name of the properties to load from the classpath
     */
    private String propertiesFile;
    /**
     * Whether to prefix the Quartz Scheduler instance name with the
     * CamelContext name. This is enabled by default to let each CamelContext
     * use its own Quartz scheduler instance by default. You can set this option
     * to false to reuse Quartz scheduler instances between multiple
     * CamelContext's.
     */
    private Boolean prefixInstanceName = false;
    /**
     * To use the custom SchedulerFactory which is used to create the Scheduler.
     */
    private SchedulerFactory schedulerFactory;
    /**
     * To use the custom configured Quartz scheduler instead of creating a new
     * Scheduler.
     */
    private Scheduler scheduler;

    public Boolean getAutoStartScheduler() {
        return autoStartScheduler;
    }

    public void setAutoStartScheduler(Boolean autoStartScheduler) {
        this.autoStartScheduler = autoStartScheduler;
    }

    public int getStartDelayedSeconds() {
        return startDelayedSeconds;
    }

    public void setStartDelayedSeconds(int startDelayedSeconds) {
        this.startDelayedSeconds = startDelayedSeconds;
    }

    public Boolean getPrefixJobNameWithEndpointId() {
        return prefixJobNameWithEndpointId;
    }

    public void setPrefixJobNameWithEndpointId(
            Boolean prefixJobNameWithEndpointId) {
        this.prefixJobNameWithEndpointId = prefixJobNameWithEndpointId;
    }

    public Boolean getEnableJmx() {
        return enableJmx;
    }

    public void setEnableJmx(Boolean enableJmx) {
        this.enableJmx = enableJmx;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getPropertiesFile() {
        return propertiesFile;
    }

    public void setPropertiesFile(String propertiesFile) {
        this.propertiesFile = propertiesFile;
    }

    public Boolean getPrefixInstanceName() {
        return prefixInstanceName;
    }

    public void setPrefixInstanceName(Boolean prefixInstanceName) {
        this.prefixInstanceName = prefixInstanceName;
    }

    public SchedulerFactory getSchedulerFactory() {
        return schedulerFactory;
    }

    public void setSchedulerFactory(SchedulerFactory schedulerFactory) {
        this.schedulerFactory = schedulerFactory;
    }

    public Scheduler getScheduler() {
        return scheduler;
    }

    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }
}