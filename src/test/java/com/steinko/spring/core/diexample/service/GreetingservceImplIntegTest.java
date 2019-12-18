package com.steinko.spring.core.diexample.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.elasticsearch.test.ESIntegTestCase;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class GreetingservceImplIntegTest extends ESIntegTestCase{
	
	@Autowired
	GreetingServiceImpl service;
	
	@Test
	void shouldReturnHelloWorl() {
		assertEquals("Hello Guru", service.sayGreeting());
	}
}
