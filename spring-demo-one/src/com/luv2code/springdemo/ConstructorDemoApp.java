package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get a bean from the spring IOC container
		// the instance of the Coach is defined in the applicationContext.xml beans
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// use the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune()); 
		//the FortuneService was injected to the Coach by IOC on construction

		context.close();

	}

}
