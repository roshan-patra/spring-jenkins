package com.javatechie.jenkin.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	private static final Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application Started....");
	}

	public static void main(String[] args) {
		logger.info("Application Executed...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
