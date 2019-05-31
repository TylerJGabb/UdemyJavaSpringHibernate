package com.gabb.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //we are now using the default beanId assigned by Spring
//bean id is `tennisCoach`
public class TennisCoach implements Coach {
	
	private FortuneService oFortuneService;
	
	@Autowired
	public TennisCoach(FortuneService aFortuneService) {
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
