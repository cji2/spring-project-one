package edu.gmu.springproj;

public class TrackCoach implements Coach {

	// define a private field for dependency
	private FortuneService fortuneService;
	
	public TrackCoach() {
	}
	
	// define a constructor for dependency injection.
	public TrackCoach(FortuneService aFortuneService) {
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

}
