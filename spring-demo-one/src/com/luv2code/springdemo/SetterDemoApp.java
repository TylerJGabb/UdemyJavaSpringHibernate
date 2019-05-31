package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml")){
			Coach tennisCoach = ctx.getBean("myTennisCoach", Coach.class);
			System.out.println(tennisCoach.getDailyWorkout());
			System.out.println(tennisCoach.getFortune()); 
		}
		

	}

}
