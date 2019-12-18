package com.steinko.spring.core.diexample.controller;

import com.steinko.spring.core.diexample.service.GreetingService;

public class ConstructorInjectedController {
	private GreetingService service;

	public ConstructorInjectedController(GreetingService service) {
		this.service = service;
	}

	public String sayGreeting() {
		
		return service.sayGreeting();
	}

}
