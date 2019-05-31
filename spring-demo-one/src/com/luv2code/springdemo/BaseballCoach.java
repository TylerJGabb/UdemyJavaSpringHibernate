package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService oFortuneService;

	//dependency injection via constructor
	public BaseballCoach(FortuneService aFortuneService) {
		oFortuneService = aFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getFortune() {
		return oFortuneService.getFortune();
	}
	
	
}
