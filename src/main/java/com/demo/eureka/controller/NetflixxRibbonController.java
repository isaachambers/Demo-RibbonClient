package com.demo.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NetflixxRibbonController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/")
	private String getService() {
		return restTemplate.getForEntity("http://congo", String.class).getBody();
	}
}
