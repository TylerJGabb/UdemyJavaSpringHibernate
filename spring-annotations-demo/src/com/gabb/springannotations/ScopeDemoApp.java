package com.gabb.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemoApp {

	public static void main(String[] args) throws InterruptedException {

		try(ClassPathXmlApplicationContext ctx = 
			new ClassPathXmlApplicationContext(
				"applicationContext.xml")){
			
			Coach coach1 = ctx.getBean("tennisCoach", Coach.class);
			Coach coach2 = ctx.getBean("tennisCoach", Coach.class);
			System.out.println("coach1==coach2 : " + (coach1 == coach2));
			Thread.sleep(10000);
			System.out.println("Exiting autoClosing try");
		}
		System.out.println("Exited autoClosing try");
	}

}
