package com.steinko.spring.core.diexample.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.elasticsearch.test.ESIntegTestCase;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MyControllerIntegTest extends ESIntegTestCase{
	
	@Autowired
	MyController controller;
	
	@Test
	void shouldReturnHelloWorl() {
		assertEquals("Hello World", controller.hello());
	}

}
