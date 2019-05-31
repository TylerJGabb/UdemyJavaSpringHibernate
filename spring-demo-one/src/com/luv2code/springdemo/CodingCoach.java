package com.luv2code.springdemo;

public class CodingCoach implements Coach {

	private FortuneService oFortuneService;
	
	public CodingCoach(FortuneService aFortuneService) {
		oFortuneService = aFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Create the TRM application with 20/20 hindsight!. You can do it, Tyler!";
	}

	@Override
	public String getFortune() {
		return oFortuneService.getFortune();
	}

}
