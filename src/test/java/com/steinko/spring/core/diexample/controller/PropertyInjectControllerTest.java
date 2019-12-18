package com.steinko.spring.core.diexample.controller;

	import org.elasticsearch.test.ESTestCase;
	import org.junit.jupiter.api.Test;
	import org.junit.jupiter.api.BeforeEach;
	import static org.junit.jupiter.api.Assertions.assertNotNull;

	import java.lang.ModuleLayer.Controller;


	public class PropertyInjectControllerTest extends ESTestCase {
		
		private PropertyInjectController controller;
		
		@BeforeEach
		public void init(){
		    controller =  new PropertyInjectController();
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
