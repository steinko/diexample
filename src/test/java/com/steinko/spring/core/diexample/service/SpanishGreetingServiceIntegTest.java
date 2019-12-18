package com.steinko.spring.core.diexample.service;


import org.elasticsearch.test.ESTestCase;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.BeforeEach;


import com.steinko.spring.core.diexample.controller.MyController;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.test.context.ActiveProfiles;


import org.elasticsearch.test.ESIntegTestCase;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ActiveProfiles("es")
@ExtendWith(SpringExtension.class)

public class SpanishGreetingServiceIntegTest extends ESIntegTestCase {
	
	@Autowired
	private GreetingService service;
	
	
	@Test
	public void shouldExist() {	
		assertNotNull(service);
	}
	
	
	@Test
	public void shouldreturnHelloGuru() {
		assertEquals(service.sayGreeting(), "Hola Gurus");
	}

}

