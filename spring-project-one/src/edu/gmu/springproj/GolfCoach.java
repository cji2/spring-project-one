package edu.gmu.springproj;

public class GolfCoach implements Coach {
	
	// define a private field for dependency
	private FortuneService fortuneService;
	
	public GolfCoach() {}
	
	// define a constructor for dependency injection.
	public GolfCoach(FortuneService aFortuneService) {
		System.out.println("GolfCoach: inside an argument constructor!");
		fortuneService = aFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your putting skills for 2 hours today!";
	}

	@Override
	public String getDailyFortune() {
		// use my fortune service to get a fortune
		return fortuneService.getFortune();
	}
}