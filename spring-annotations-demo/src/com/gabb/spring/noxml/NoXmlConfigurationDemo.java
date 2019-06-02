package com.gabb.spring.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gabb.springannotations.Coach;
import com.gabb.springannotations.RandoCoach;
import com.gabb.springannotations.TennisCoach;

public class NoXmlConfigurationDemo {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class)){
			Coach coach = ctx.getBean("randoCoach", Coach.class);
			System.out.println(coach.getDailyWorkout());
			System.out.println(coach.getDailyFortune());
			
			
		}
	}

}
