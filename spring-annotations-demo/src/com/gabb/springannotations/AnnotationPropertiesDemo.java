package com.gabb.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationPropertiesDemo {

	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext ctx = 
			new ClassPathXmlApplicationContext(
				"applicationContext.xml")){
			
			TennisCoach coach = ctx.getBean(TennisCoach.class);
			System.out.println(coach.getDailyWorkout());
			System.out.println(coach.getDailyFortune());
			System.out.println(coach.getEmail());
		}
	}

}
