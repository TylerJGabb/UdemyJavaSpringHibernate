package com.gabb.springannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.gabb.springannotations.fortuneservices.FortuneService;

@Component
@Scope("singleton") @Lazy
public class RandoCoach implements Coach {
	
	@Value("${rando.coach.email}")
	private String email;
	
	private FortuneService oFortuneService;
	
	@Autowired
	public RandoCoach(@Qualifier("randomFortuneService") FortuneService aFortuneService) {
		System.out.println("Inside randoCoach ctor");
		System.out.println("\taFortuneService="+ aFortuneService);
		oFortuneService = aFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "DO STUFF RANDOMLY";
	}

	@Override
	public String getDailyFortune() {
		return oFortuneService.getFortune();
	}
	
	public String getEmail() {
		return email;
	}
	
	@PreDestroy
	private void preDestroy() {
		System.out.println("Inside randoCoach preDestroy:");
		System.out.println("\t" + this);
	}
	
	@PostConstruct
	private void postConstruct() {
		System.out.println("Inside randoCoach postConstruct:");
		System.out.println("\t" + this);
	}

}
