package plForLoopWeek13;

import java.util.Random;

public class ForLoop {
	
	public static void main(String[] args) {
		Random rand = new Random(); // begin the Random Number Generator
		final int MAX = 10; // constant to define the MAX random number value
		final int MIN = 1; // constant to define the MIN random number value
		int randomNumber; // variable to store and display random number
	
	for(int index = 0; index < 100; index++){
		randomNumber = rand.nextInt(MAX) + MIN;
		System.out.println("Loop iteration number" + " " + randomNumber);
	}
	}
}
