package com.steinko.spring.core.diexample.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{

	
	@Override
	public String sayGreeting() {
		return "Hello Gurus";
	}

}

