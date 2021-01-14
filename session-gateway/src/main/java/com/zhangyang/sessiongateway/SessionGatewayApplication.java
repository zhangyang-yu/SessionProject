package com.zhangyang.sessiongateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.zhangyang"})
public class SessionGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SessionGatewayApplication.class, args);
	}

}
