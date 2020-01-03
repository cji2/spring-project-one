package edu.gmu.springproj;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// create no-argument constructor.
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-argument constructor!");
	}
	
	// this setter will be called by Spring during setter injection.
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method!");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
