package com.gabb.springannotations.fortuneservices;

import org.springframework.stereotype.Component;

@Component
public class DBFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "DB Fortune";
	}

}
