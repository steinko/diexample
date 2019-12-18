package com.steinko.spring.core.diexample;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class Config {
	
	@Bean
	public Item item() {
	    return	new ItemImpl();
	}

}
