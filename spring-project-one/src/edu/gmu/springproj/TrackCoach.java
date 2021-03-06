package edu.gmu.springproj;

public class TrackCoach implements Coach {

	// define a private field for dependency
	private FortuneService fortuneService;
	
	public TrackCoach() {
	}
	
	// define a constructor for dependency injection.
	public TrackCoach(FortuneService aFortuneService) {
		System.out.println("TrackCoach: inside an-argument constructor!");
		fortuneService = aFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// add an init method.
	public void doMyStartup() {
		System.out.println("TrackCoach: inside method, doMyStartup!");
	}
	
	// add a destroy method.
	public void doMyCleanup() {
		System.out.println("TrackCoach: inside method, doMyCleanup!");
	}
}
