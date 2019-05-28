package com.zhanghan.zhservicea1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ZhServiceApplicationA1 {

	public static void main(String[] args) {

		SpringApplication.run(ZhServiceApplicationA1.class, args);
	}

}
