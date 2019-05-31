package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService oFortuneService;
	
	public TrackCoach(FortuneService aFortuneService) {
		this.oFortuneService = aFortuneService;
	}

	public TrackCoach() {
		//added so the old way works
	}

	@Override
	public String getDailyWorkout() {
		return "Run 2 Miles";
	}

	@Override
	public String getFortune() {
		return "Just Do It! " + oFortuneService.getFortune();
	}
	
	private void onBeanInitialization() {
		System.out.println("TrackCoach: onBeanInitialization");
	}
	
	private void onBeanDestroying() {
		System.out.println("TrackCoach: onBeanDestroying");
	}

}
