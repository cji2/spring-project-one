package edu.gmu.springproj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeRandomFortuneApp {

	public static void main(String[] args) {
		
		/* create a spring container
		  : load the Spring configuration file. */
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		/* retrieve bean from spring container.
		   'myGolfCoach' is bean id. 'Coach.class' is interface. */
		Coach aCoach = context.getBean("myGolfCoach", Coach.class);
		Coach anotherCoach = context.getBean("myGolfCoach", Coach.class);
		
		// check if they are same beans.
		boolean result = (aCoach == anotherCoach);

		// print out the results.
		System.out.println("\nTwo beans (aCoach and anotherCoach) point to the same object: " + result);
		System.out.println("\nMemory location for the aCoach: " + aCoach);
		System.out.println("Memory location for the anotherCoach: " + anotherCoach);

		
		// call methods on the bean.
		System.out.println("\n" + aCoach.getDailyWorkout());
		
		// call new method for fortune service.
		System.out.println(aCoach.getDailyFortune());
		
		// close the application context.
		context.close();
	}
}
