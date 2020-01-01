package edu.gmu.springproj;

public class MyApp {

	public static void main(String[] args) {

		// create the object.
		// BaseballCoach aCoach = new BaseballCoach();
		Coach aCoach = new BaseballCoach();
		
		// use the object.		
		String result = aCoach.getDailyWorkout();
		System.out.println(result);
	}
}
