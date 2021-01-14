package com.zhangyang.sessionredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient
@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages = {"com.zhangyang"})
public class SessionRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SessionRedisApplication.class, args);
	}

}
