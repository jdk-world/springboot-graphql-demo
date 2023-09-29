package com.demo.spring.graphql.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.graphql.entity.Product;
import com.demo.spring.graphql.query.ProductQuery;

@RestController
public class HomeController {

	@Autowired
	ProductQuery productQuery;

	@GetMapping("/hello")
	public List<Product> sayHello() {
		Map<String, Object> response = new HashMap<>();
		response.put("message", "Hello, World!");
		List<Product> products = productQuery.products();
		return products;
	}

}