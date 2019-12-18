package com.steinko.spring.core.diexample.service;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello Gurus";
	}

}
