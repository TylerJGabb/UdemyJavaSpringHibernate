package com.gabb.spring.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.gabb.springannotations.Coach;
import com.gabb.springannotations.RandoCoach;
import com.gabb.springannotations.TennisCoach;
import com.gabb.springannotations.fortuneservices.FortuneService;
import com.gabb.springannotations.fortuneservices.RandomFortuneService;

@Configuration
@ComponentScan("com.gabb.springannotations")
public class AppConfig {
	
// If we turn off @ComponentScan
// Then we need to define the beans manually here
//	@Bean
//	public FortuneService randomFortuneService() {
//		return new RandomFortuneService();
//	}
//	
//	@Bean
//	public Coach randoCoach() {
//		return new RandoCoach(randomFortuneService());
//	}
//	
//	@Bean
//	public Coach tennisCoach() {
//		return new TennisCoach(randomFortuneService());
//	}
	
}
