package com.steinko.spring.core.diexample.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class MyController {
	private static Logger logger = LogManager.getLogger(MyController.class);
	
	
	public String hello() {
		String hello = "Hello World";
		logger.info(hello);
		return hello;
	}

}
