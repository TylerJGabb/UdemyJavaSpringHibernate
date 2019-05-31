package com.luv2code.springdemo;

public class TennisCoach implements Coach {

	private FortuneService oFortuneService;
	
	public void setFortuneService(FortuneService aFortuneService) {
		System.out.println("TennisCoach says: My oFortuneService was set!");
		oFortuneService = aFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Grunt a lot and make lots of noise when you hit the ball";
	}

	@Override
	public String getFortune() {
		return oFortuneService.getFortune();
	}

}
