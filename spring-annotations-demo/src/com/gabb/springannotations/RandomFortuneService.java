package com.gabb.springannotations;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private List<String> oFortunes;
	private Random oRando;
	
	public RandomFortuneService() {
		System.out.println("Inside RandoFortServ ctor");
		oFortunes = Arrays.asList("Yes", "No", "Maybe", "Try Again", "Not Likely");
		oRando = new Random();
	}
	
	@Override
	public String getFortune() {
		return oFortunes.get(oRando.nextInt(oFortunes.size()));
	}

}
