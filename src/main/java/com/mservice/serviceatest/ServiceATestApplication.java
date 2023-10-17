package com.mservice.serviceatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceATestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceATestApplication.class, args);
    }

}
