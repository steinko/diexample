package com.steinko.spring.core.diexample.controller;

import com.steinko.spring.core.diexample.service.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Qualifier;

@Controller
public class ConstructorInjectedController {
	
	private GreetingService service;

	public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService service) {
		this.service = service;
	}

	public String sayGreeting() {
		
		return service.sayGreeting();
	}

}
