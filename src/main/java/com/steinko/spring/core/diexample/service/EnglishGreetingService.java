package com.steinko.spring.core.diexample.service;



import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("en")
@Service
@Primary
public class EnglishGreetingService  implements GreetingService {
	
	@Override
	public String sayGreeting() {
		return "English";
	}
	

}
