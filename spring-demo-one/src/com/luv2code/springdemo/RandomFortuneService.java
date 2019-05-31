package com.luv2code.springdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private List<String> oFortunes = Arrays.asList("Yes", "No", "Maybe", "Try Again");
	private Random oRando = new Random();
	
	@Override
	public String getFortune() {
		return oFortunes.get(oRando.nextInt(oFortunes.size()));
	}

}
