package testrunner.manager;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){
			TestRunnerManager trm = ctx.getBean(TestRunnerManager.class);
			System.out.println(trm);
		}
	}

}
