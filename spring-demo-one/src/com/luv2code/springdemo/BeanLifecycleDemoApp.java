package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext ctx =
			new ClassPathXmlApplicationContext(
					"beanLifecycleAppCtx.xml")){
			
			Coach coach = ctx.getBean("myCoach", Coach.class);
			System.out.println(coach.getFortune());
		}
	}

}
