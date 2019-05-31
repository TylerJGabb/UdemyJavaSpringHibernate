package com.gabb.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext ctx = 
			new ClassPathXmlApplicationContext(
				"applicationContext.xml")){
			
			Coach coach = ctx.getBean("tennisCoach", Coach.class);
			System.out.println(coach.getDailyWorkout());
		}
	}

}
