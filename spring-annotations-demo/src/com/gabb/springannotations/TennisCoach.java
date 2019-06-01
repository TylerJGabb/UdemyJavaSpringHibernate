package com.gabb.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.gabb.springannotations.fortuneservices.FortuneService;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Value("${tennis.coach.email}")
	private String email;
	
	private FortuneService oFortuneService;
	
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService aFortuneService) {
		System.out.println("Inside tennisCoach constructor with aFortuneService="+ aFortuneService);
		oFortuneService = aFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Grunt a lot, make a lot of noise";
	}

	@Override
	public String getDailyFortune() {
		return oFortuneService.getFortune();
	}
	
	public String getEmail() {
		return email;
	}

}
