package com.steinko.spring.core.diexample.service;

import org.elasticsearch.test.ESTestCase;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import com.steinko.spring.core.diexample.controller.MyController;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GreetingServiceImplTest extends ESTestCase{
	
	GreetingServiceImpl service;
	@BeforeEach
	public void init(){
	    service =  new GreetingServiceImpl();
	}
	
	@Test
	public void shouldExist() {
		
		assertNotNull(service);
	}
	
	
	@Test
	public void shouldreturnHelloGuru() {
		assertEquals(service.sayGreeting(), "Hello Gurus");
	}

}
