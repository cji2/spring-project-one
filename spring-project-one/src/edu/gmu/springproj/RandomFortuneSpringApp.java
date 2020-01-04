package edu.gmu.springproj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneSpringApp {

	public static void main(String[] args) {
		
		/* create a spring container
		  : load the Spring configuration file. */
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		/* retrieve bean from spring container.
		   'myGolfCoach' is bean id. 'Coach.class' is interface. */
		Coach aCoach = context.getBean("myGolfCoach", Coach.class);
		
		// call methods on the bean.
		System.out.println(aCoach.getDailyWorkout());
		
		// call new method for fortune service.
		System.out.println(aCoach.getDailyFortune());
		
		// close the application context.
		context.close();
	}
}
