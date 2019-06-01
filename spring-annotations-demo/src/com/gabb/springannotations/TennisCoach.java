package com.gabb.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.gabb.springannotations.fortuneservices.FortuneService;

@Component
public class TennisCoach implements Coach {
	
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

}
