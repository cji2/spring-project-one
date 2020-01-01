package edu.gmu.springproj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringProjApp {

	public static void main(String[] args) {
		
		/* create a spring container
		  : load the Spring configuration file. */
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/* retrieve bean from spring container.
		   'myCoach' is bean id. 'Coach.class' is interface. */
		Coach aCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean.
		System.out.println(aCoach.getDailyWorkout());
		
		// close the application context.
		context.close();
	}

}
