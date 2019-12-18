package com.steinko.spring.core.diexample.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.test.context.ActiveProfiles;


import org.elasticsearch.test.ESIntegTestCase;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ActiveProfiles("en")
@ExtendWith(SpringExtension.class)

public class EnglishGreetingServiceIntegTest extends ESIntegTestCase {
	
	@Autowired
	private GreetingService service;
	
	
	@Test
	public void shouldExist() {	
		assertNotNull(service);
	}
	
	
	@Test
	public void shouldreturnHelloGuru() {
		assertEquals(service.sayGreeting(), "English");
	}

}


