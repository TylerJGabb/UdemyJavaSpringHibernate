package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "The new TRM will be fantastic!";
	}

}
