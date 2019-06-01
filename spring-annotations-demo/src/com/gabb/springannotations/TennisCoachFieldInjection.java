package com.gabb.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.gabb.springannotations.fortuneservices.FortuneService;

@Component
public class TennisCoachFieldInjection implements Coach {
	
	@Autowired @Qualifier("randomFortuneService")
	private FortuneService oFortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Grunt a lot, make a lot of noise";
	}

	@Override
	public String getDailyFortune() {
		return oFortuneService.getFortune();
	}
}
