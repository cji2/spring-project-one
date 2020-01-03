package edu.gmu.springproj;

public class BaseballCoach implements Coach {
	
	// define a private field for dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection.
	public BaseballCoach(FortuneService aFortuneService) {
		fortuneService = aFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortune service to get a fortune
		return fortuneService.getFortune();
	}
}
