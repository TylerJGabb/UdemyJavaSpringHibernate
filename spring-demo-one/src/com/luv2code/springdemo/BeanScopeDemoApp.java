package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext ctx = 
			new ClassPathXmlApplicationContext(
				"beanScope-applicationContext.xml")){
			
			Coach coach = ctx.getBean("myCoach", Coach.class);
			Coach coach2 = ctx.getBean("myCoach", Coach.class);
			
			System.out.println("coach is at " + coach);
			System.out.println("coach2 is at " + coach2);
			System.out.println("same object = " + (coach == coach2));
		}
	}

}
