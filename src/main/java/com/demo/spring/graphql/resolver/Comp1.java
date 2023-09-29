package com.demo.spring.graphql.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

public class Comp1 {

	
	@Component
	public class HelloQuery implements GraphQLQueryResolver {
	    public String hello() {
	        return "Hello World!";
	    }

	    public String greeting(String name) {
	        return String.format("Hello, %s", name);
	    }
	}
}
