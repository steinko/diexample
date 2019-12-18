package com.steinko.spring.core.diexample;

import org.junit.jupiter.api.Test;
import org.elasticsearch.test.ESIntegTestCase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DiExampleApplicationTests extends ESIntegTestCase {
	@Autowired
	private ApplicationContext applicationContext;
	
	
	
	@Test
	void shoudlHaveLoadeAppContext() { 
		assertNotNull(applicationContext);
	}
	
	@Test
	void contextLoads() {
	}

}
