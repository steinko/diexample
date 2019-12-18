package com.steinko.spring.core.diexample.controller;

import com.steinko.spring.core.diexample.service.GreetingServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
public class PropertyInjectController {
	
	@Autowired
	private GreetingServiceImpl service ;

	public String sayGreeting() {
		
		return service.sayGreeting();
	}

}
