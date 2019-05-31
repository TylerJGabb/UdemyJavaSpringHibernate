package com.gabb.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //we are now using the default beanId assigned by Spring
//bean id is `tennisCoach`
public class TennisCoachFieldInjection implements Coach {
	
	@Autowired
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
