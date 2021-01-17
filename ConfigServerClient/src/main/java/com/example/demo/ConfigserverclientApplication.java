package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RefreshScope
@RestController
public class ConfigserverclientApplication {
	@Autowired
	private Environment env;

	@Value("${welcome.message}")
	String welcomeText;

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverclientApplication.class, args);
	}
	
	@RequestMapping(value = "/")
	public String welcomeText() {
		return welcomeText;
	}

	@RequestMapping("/hello")
	public ResponseEntity<String> getHello(Model model) {

		return new ResponseEntity<String>(env.getProperty("message"), HttpStatus.OK);

	}
	
	@RequestMapping("/development")
	public ResponseEntity<String> getDevelopment(Model model) {

		return new ResponseEntity<String>(env.getProperty("function.message"), HttpStatus.OK);

	}
	
}
