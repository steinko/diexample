package com.steinko.spring.core.diexample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.elasticsearch.test.ESIntegTestCase;

@SpringJUnitConfig(classes = { Config.class})

public class StoreDITest extends ESIntegTestCase {
	
	@Autowired
	Store store;
	
	void shouldBeCreated() {
		assertTrue(store.getItem() instanceof Item);
	}
	
	

}
