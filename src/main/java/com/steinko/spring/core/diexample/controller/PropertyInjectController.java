package com.steinko.spring.core.diexample.controller;

import com.steinko.spring.core.diexample.service.GreetingServiceImpl;

public class PropertyInjectController {
	
	private GreetingServiceImpl service = new GreetingServiceImpl();

	public String sayGreeting() {
		
		return service.sayGreeting();
	}

}
