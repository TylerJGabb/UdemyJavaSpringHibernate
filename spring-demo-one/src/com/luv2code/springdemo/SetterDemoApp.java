package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml")){
			TennisCoach tennisCoach = ctx.getBean("myTennisCoach", TennisCoach.class);
			System.out.println(tennisCoach.getDailyWorkout());
			System.out.println(tennisCoach.getFortune());
			System.out.println(tennisCoach.getEmail());
		}
		

	}

}
