package com.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoRibbonClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRibbonClientApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate getTemplate() {

		return new RestTemplate();
	}

}
