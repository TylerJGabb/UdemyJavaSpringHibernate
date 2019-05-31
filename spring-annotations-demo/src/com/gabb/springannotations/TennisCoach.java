package com.gabb.springannotations;

import org.springframework.stereotype.Component;

@Component //we are now using the default beanId assigned by Spring
//bean id is `tennisCoach`
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Grunt a lot, make a lot of noise";
	}

}
