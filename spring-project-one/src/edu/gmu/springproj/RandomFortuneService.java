package edu.gmu.springproj;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	// create an array of strings.
	private String[] data = {
			"The fear of the LORD is the beginning of knowldge",
			"Listen to your father's instruction",
			"If sinners entice you, do not give in to them"
	};
	
	// create a random number generator.
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		// pick a random string from the array.
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}
}
