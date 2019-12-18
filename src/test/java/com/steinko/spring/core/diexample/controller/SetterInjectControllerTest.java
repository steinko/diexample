package com.steinko.spring.core.diexample.controller;


	
	import org.elasticsearch.test.ESTestCase;
	import org.junit.jupiter.api.Test;

import com.steinko.spring.core.diexample.service.GreetingService;
import com.steinko.spring.core.diexample.service.GreetingServiceImpl;

import org.junit.jupiter.api.BeforeEach;
	import static org.junit.jupiter.api.Assertions.assertNotNull;

	import java.lang.ModuleLayer.Controller;


	public class SetterInjectControllerTest extends ESTestCase {
		
		private SetterInjectController controller;
		
		@BeforeEach
		public void init(){
		    controller =  new SetterInjectController();
		    GreetingService service = new GreetingServiceImpl();
		    controller.setGretingService(service);
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