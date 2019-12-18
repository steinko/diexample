package com.steinko.spring.core.diexample.controller;

import com.steinko.spring.core.diexample.service.GreetingService;

import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectController {
	
	GreetingService service;

	public String sayGreeting() {
		return service.sayGreeting();
	}

	public void setGretingService(GreetingService service) {
		this.service = service;
		
	}

}
