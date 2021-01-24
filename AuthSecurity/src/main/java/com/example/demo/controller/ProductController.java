package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@RequestMapping(value = "/products")
	   public String getProductName() {
	      return "Honey"; 
	}
}
