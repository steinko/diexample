package com.steinko.spring.core.diexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.elasticsearch.test.ESIntegTestCase;

@SpringJUnitConfig(classes = { Config.class})
public class ItemTest extends ESIntegTestCase {
	@Autowired
	Item item;
	@Test
	void shouldExist() {
		assertNotNull(item);
		
	}
	
	

}
