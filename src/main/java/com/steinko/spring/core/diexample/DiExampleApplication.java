package com.steinko.spring.core.diexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.steinko.spring.core.diexample.controller.MyController;



@SpringBootApplication
public class DiExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiExampleApplication.class, args);
		MyController controller = (MyController)ctx.getBean("MyController");
		controller.hello();
	}

}
