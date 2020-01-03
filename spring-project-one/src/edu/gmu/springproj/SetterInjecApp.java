package edu.gmu.springproj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjecApp {

	public static void main(String[] args) {
		
		/* create a spring container
		  : load the Spring configuration file. */
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/* retrieve bean from spring container.
		   'myCoach' is bean id. 'Coach.class' is interface. 
		   we use CricketCoach object, rather than Coach,
		   since Coach interface has neither emailAddress nor team. */
		CricketCoach aCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call methods on the bean.
		System.out.println(aCoach.getDailyWorkout());
		
		// call new method for fortune service.
		System.out.println(aCoach.getDailyFortune());
		
		// call our new methods to get the injected literal values.
		System.out.println(aCoach.getEmailAddress());
		System.out.println(aCoach.getTeam());
		
		// close the application context.
		context.close();
	}
}
