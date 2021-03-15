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
package org.apache.camel.component.aws.ec2;

import java.util.ArrayList;
import java.util.Collection;

import com.amazonaws.services.ec2.model.DescribeInstanceStatusResult;
import com.amazonaws.services.ec2.model.DescribeInstancesResult;
import com.amazonaws.services.ec2.model.InstanceStateName;
import com.amazonaws.services.ec2.model.InstanceType;
import com.amazonaws.services.ec2.model.MonitorInstancesResult;
import com.amazonaws.services.ec2.model.MonitoringState;
import com.amazonaws.services.ec2.model.RunInstancesResult;
import com.amazonaws.services.ec2.model.StartInstancesResult;
import com.amazonaws.services.ec2.model.StopInstancesResult;
import com.amazonaws.services.ec2.model.TerminateInstancesResult;
import com.amazonaws.services.ec2.model.UnmonitorInstancesResult;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.test.spring.junit5.CamelSpringTestSupport;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EC2ComponentSpringTest extends CamelSpringTestSupport {

    @Test
    public void createAndRunInstances() {

        Exchange exchange = template.request("direct:createAndRun", new Processor() {
            public void process(Exchange exchange) throws Exception {
                exchange.getIn().setHeader(EC2Constants.OPERATION, EC2Operations.createAndRunInstances);
                exchange.getIn().setHeader(EC2Constants.IMAGE_ID, "test-1");
                exchange.getIn().setHeader(EC2Constants.INSTANCE_TYPE, InstanceType.T2Micro);
                exchange.getIn().setHeader(EC2Constants.INSTANCE_MIN_COUNT, 1);
                exchange.getIn().setHeader(EC2Constants.INSTANCE_MAX_COUNT, 1);
            }
        });

        RunInstancesResult resultGet = (RunInstancesResult) exchange.getMessage().getBody();
        assertEquals("test-1", resultGet.getReservation().getInstances().get(0).getImageId());
        assertEquals(InstanceType.T2Micro.toString(), resultGet.getReservation().getInstances().get(0).getInstanceType());
        assertEquals("instance-1", resultGet.getReservation().getInstances().get(0).getInstanceId());
    }

    @Test
    public void ec2CreateAndRunTestWithKeyPair() throws Exception {

        Exchange exchange = template.request("direct:createAndRun", new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                exchange.getIn().setHeader(EC2Constants.OPERATION, EC2Operations.createAndRunInstances);
                exchange.getIn().setHeader(EC2Constants.IMAGE_ID, "test-1");
                exchange.getIn().setHeader(EC2Constants.INSTANCE_TYPE, InstanceType.T2Micro);
                exchange.getIn().setHeader(EC2Constants.INSTANCE_MIN_COUNT, 1);
                exchange.getIn().setHeader(EC2Constants.INSTANCE_MAX_COUNT, 1);
                exchange.getIn().setHeader(EC2Constants.INSTANCES_KEY_PAIR, "keypair-1");
            }
        });

        RunInstancesResult resultGet = (RunInstancesResult) exchange.getMessage().getBody();
        assertEquals("test-1", resultGet.getReservation().getInstances().get(0).getImageId());
        assertEquals(InstanceType.T2Micro.toString(), resultGet.getReservation().getInstances().get(0).getInstanceType());
        assertEquals("instance-1", resultGet.getReservation().getInstances().get(0).getInstanceId());
        assertEquals(2, resultGet.getReservation().getInstances().get(0).getSecurityGroups().size());
        assertEquals("id-3", resultGet.getReservation().getInstances().get(0).getSecurityGroups().get(0).getGroupId());
        assertEquals("id-4", resultGet.getReservation().getInstances().get(0).getSecurityGroups().get(1).getGroupId());
    }

    @Test
    public void startInstances() {

        Exchange exchange = template.request("direct:start", new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                Collection<String> l = new ArrayList<>();
                l.add("test-1");
                exchange.getIn().setHeader(EC2Constants.INSTANCES_IDS, l);
            }
        });

        StartInstancesResult resultGet = (StartInstancesResult) exchange.getMessage().getBody();
        assertEquals("test-1", resultGet.getStartingInstances().get(0).getInstanceId());
        assertEquals(resultGet.getStartingInstances().get(0).getPreviousState().getName(),
                InstanceStateName.Stopped.toString());
        assertEquals(resultGet.getStartingInstances().get(0).getCurrentState().getName(), InstanceStateName.Running.toString());
    }

    @Test
    public void stopInstances() {

        Exchange exchange = template.request("direct:stop", new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                Collection<String> l = new ArrayList<>();
                l.add("test-1");
                exchange.getIn().setHeader(EC2Constants.INSTANCES_IDS, l);
            }
        });

        StopInstancesResult resultGet = (StopInstancesResult) exchange.getMessage().getBody();
        assertEquals("test-1", resultGet.getStoppingInstances().get(0).getInstanceId());
        assertEquals(InstanceStateName.Running.toString(),
                resultGet.getStoppingInstances().get(0).getPreviousState().getName());
        assertEquals(InstanceStateName.Stopped.toString(),
                resultGet.getStoppingInstances().get(0).getCurrentState().getName());
    }

    @Test
    public void terminateInstances() {

        Exchange exchange = template.request("direct:terminate", new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                Collection<String> l = new ArrayList<>();
                l.add("test-1");
                exchange.getIn().setHeader(EC2Constants.INSTANCES_IDS, l);
            }
        });

        TerminateInstancesResult resultGet = (TerminateInstancesResult) exchange.getMessage().getBody();
        assertEquals("test-1", resultGet.getTerminatingInstances().get(0).getInstanceId());
        assertEquals(resultGet.getTerminatingInstances().get(0).getPreviousState().getName(),
                InstanceStateName.Running.toString());
        assertEquals(resultGet.getTerminatingInstances().get(0).getCurrentState().getName(),
                InstanceStateName.Terminated.toString());
    }

    @Test
    public void ec2DescribeSpecificInstancesTest() throws Exception {

        Exchange exchange = template.request("direct:describe", new Processor() {

            @Override
            public void process(Exchange exchange) throws Exception {
                Collection<String> l = new ArrayList<>();
                l.add("instance-1");
                exchange.getIn().setHeader(EC2Constants.INSTANCES_IDS, l);
            }
        });

        DescribeInstancesResult resultGet = (DescribeInstancesResult) exchange.getMessage().getBody();
        assertEquals(1, resultGet.getReservations().size());
        assertEquals(1, resultGet.getReservations().get(0).getInstances().size());
    }

    @Test
    public void ec2DescribeStatusSpecificInstancesTest() throws Exception {

        Exchange exchange = template.request("direct:describeStatus", new Processor() {

            @Override
            public void process(Exchange exchange) throws Exception {
                Collection<String> l = new ArrayList<>();
                l.add("test-1");
                exchange.getIn().setHeader(EC2Constants.INSTANCES_IDS, l);
            }
        });

        assertMockEndpointsSatisfied();

        DescribeInstanceStatusResult resultGet = (DescribeInstanceStatusResult) exchange.getMessage().getBody();
        assertEquals(1, resultGet.getInstanceStatuses().size());
        assertEquals(InstanceStateName.Running.toString(), resultGet.getInstanceStatuses().get(0).getInstanceState().getName());
    }

    @Test
    public void ec2RebootInstancesTest() throws Exception {

        template.request("direct:reboot", new Processor() {

            @Override
            public void process(Exchange exchange) throws Exception {
                Collection<String> l = new ArrayList<>();
                l.add("test-1");
                exchange.getIn().setHeader(EC2Constants.INSTANCES_IDS, l);
            }
        });
    }

    @Test
    public void ec2MonitorInstancesTest() throws Exception {

        Exchange exchange = template.request("direct:monitor", new Processor() {

            @Override
            public void process(Exchange exchange) throws Exception {
                Collection<String> l = new ArrayList<>();
                l.add("test-1");
                exchange.getIn().setHeader(EC2Constants.INSTANCES_IDS, l);
            }
        });

        MonitorInstancesResult resultGet = (MonitorInstancesResult) exchange.getMessage().getBody();

        assertEquals(1, resultGet.getInstanceMonitorings().size());
        assertEquals("test-1", resultGet.getInstanceMonitorings().get(0).getInstanceId());
        assertEquals(MonitoringState.Enabled.toString(),
                resultGet.getInstanceMonitorings().get(0).getMonitoring().getState());
    }

    @Test
    public void ec2UnmonitorInstancesTest() throws Exception {

        Exchange exchange = template.request("direct:unmonitor", new Processor() {

            @Override
            public void process(Exchange exchange) throws Exception {
                Collection<String> l = new ArrayList<>();
                l.add("test-1");
                exchange.getIn().setHeader(EC2Constants.INSTANCES_IDS, l);
            }
        });

        UnmonitorInstancesResult resultGet = (UnmonitorInstancesResult) exchange.getMessage().getBody();

        assertEquals(1, resultGet.getInstanceMonitorings().size());
        assertEquals("test-1", resultGet.getInstanceMonitorings().get(0).getInstanceId());
        assertEquals(MonitoringState.Disabled.toString(),
                resultGet.getInstanceMonitorings().get(0).getMonitoring().getState());
    }

    @Override
    protected AbstractApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("org/apache/camel/component/aws/ec2/EC2ComponentSpringTest-context.xml");
    }
}