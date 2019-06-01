package com.gabb.spring.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gabb.springannotations.TennisCoach;

public class NoXmlConfigurationDemo {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class)){
			TennisCoach coach = ctx.getBean(TennisCoach.class);
			
		}
	}

}
