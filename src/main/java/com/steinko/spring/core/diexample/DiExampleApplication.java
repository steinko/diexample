package com.steinko.spring.core.diexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.steinko.spring.core.diexample.controller.ConstructorInjectedController;
import com.steinko.spring.core.diexample.controller.MyController;
import com.steinko.spring.core.diexample.controller.PropertyInjectController;
import com.steinko.spring.core.diexample.controller.SetterInjectController;
import com.steinko.spring.core.diexample.service.GreetingService;
import com.steinko.spring.core.diexample.service.GreetingServiceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



@SpringBootApplication
public class DiExampleApplication {
	private static Logger logger = LogManager.getLogger(DiExampleApplication.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiExampleApplication.class, args);
		MyController controller = (MyController)ctx.getBean(MyController.class);
		logger.info(controller.hello());
		
		PropertyInjectController picontroller = (PropertyInjectController)ctx.getBean(PropertyInjectController.class);
		logger.info(picontroller.sayGreeting());
		

		SetterInjectController sicontroller = (SetterInjectController)ctx.getBean(SetterInjectController.class);
		GreetingService service = new GreetingServiceImpl();
	    sicontroller.setGretingService(service);
		logger.info(sicontroller.sayGreeting());
		
		ConstructorInjectedController cicontroller = (ConstructorInjectedController)ctx.getBean(ConstructorInjectedController.class);
		logger.info(cicontroller.sayGreeting());
		
		
	}

}
