package com.steinko.spring.core.diexample.controller;

import com.steinko.spring.core.diexample.service.GreetingService;

public class SetterInjectController {
	
	GreetingService service;

	public String sayGreeting() {
		// TODO Auto-generated method stub
		return service.sayGreeting();
	}

	public void setGretingService(GreetingService service) {
		this.service = service;
		
	}

}
