package edu.gmu.springproj;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "God bless you!";
	}

}
