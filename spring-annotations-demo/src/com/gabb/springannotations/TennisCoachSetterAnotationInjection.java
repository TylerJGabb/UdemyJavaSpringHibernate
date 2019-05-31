package com.gabb.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component @Lazy
public class TennisCoachSetterAnotationInjection implements Coach {
	
	private FortuneService oFortuneService;
	
	//public TennisCoachSetterAnotationInjection() {
	//}

	@Autowired
	public void setFortuneService(FortuneService aFortuneService) {
		System.out.println("Inside TennisCoachSetterAnnotationInjection setFortuneService");
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
