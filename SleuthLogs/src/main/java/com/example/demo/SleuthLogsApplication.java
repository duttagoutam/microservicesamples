package com.example.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SleuthLogsApplication {
	private static final Logger LOG = Logger.getLogger(SleuthLogsApplication.class.getName());
	public static void main(String[] args) {
		SpringApplication.run(SleuthLogsApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		LOG.log(Level.INFO, "Index API is calling Start");
		String welcome = "Welcome Sleuth log Tracing!";
		LOG.log(Level.INFO, "Index API is calling End");
		return welcome;
	}

	@Bean
	public AlwaysSampler defaultSampler() {
		return new AlwaysSampler();
	}	   
}
