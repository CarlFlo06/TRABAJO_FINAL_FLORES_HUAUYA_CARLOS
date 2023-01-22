package com.gateway.m.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayMServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayMServiceApplication.class, args);
	}

}
