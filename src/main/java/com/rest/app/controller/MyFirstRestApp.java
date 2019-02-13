package com.rest.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class MyFirstRestApp {
	
	@RequestMapping("/hello")
	public String sayHelloWorld() {
		return "Hello this is my First Rest Application.";
	}

}
