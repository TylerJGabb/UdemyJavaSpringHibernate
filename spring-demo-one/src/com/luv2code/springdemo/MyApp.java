package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		//create the object without using the IOC container
		Coach theCoach = new TrackCoach();
		
		//use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
