package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LogbackLoggingApplication {
	private static final Logger logger = LoggerFactory.getLogger(LogbackLoggingApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(LogbackLoggingApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		logger.info("Index API is calling Start");
		String welcome = "Welcome to Logback Application!";
		logger.info("Index API is calling End");
		return welcome;
	}   
}
