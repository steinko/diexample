package com.steinko.spring.core.diexample.controller;

import org.elasticsearch.test.ESTestCase;
import org.junit.jupiter.api.Test;

import com.steinko.spring.core.diexample.service.GreetingService;
import com.steinko.spring.core.diexample.service.GreetingServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertNotNull;

	
public class ConstructorInjectedControllerTest  extends ESTestCase {
		
		private ConstructorInjectedController controller;
		
		@BeforeEach
		public void init(){
		    
		    GreetingService service = new GreetingServiceImpl();
		    controller =  new ConstructorInjectedController(service);
		    
		}
		
		@Test
		void shouldExist() {
			assertNotNull(controller);
		}
		
		@Test
		void shouldReturHelloWorld() {
			
			assertEquals(controller.sayGreeting(), "Hello Guru");
		}
		

}
