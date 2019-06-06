package com.gabb.spring.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gabb.springannotations.Coach;
import com.gabb.springannotations.RandoCoach;
import com.gabb.springannotations.TennisCoach;

public class NoXmlConfigurationDemo {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class)){
			//note that can can do either of the following to get the randocoach
			//after specifying the @Bean 
			RandoCoach rcoach = ctx.getBean(RandoCoach.class);
			System.out.println(rcoach.getDailyWorkout());
			System.out.println(rcoach.getDailyFortune());
			System.out.println(rcoach.getEmail());
			
			
		}
	}

}
