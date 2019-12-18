package com.steinko.spring.core.diexample.service;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("es")
@Service
@Primary
public class SpanishGreetingService implements GreetingService {
	
	@Override
	public String sayGreeting() {
		return "Hola Gurus";
	}
	

}
