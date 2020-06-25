/*
 * Lottery Game
 * Naomi Keller
 * Last Updated 9/5/2019
 * The user guesses what the randomly generated number may be.
 * User gets different message depending on how close they were to the number.
 */

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		// Generating the lottery
		// These two lines create random number that will always be 3 digits.
		int range = (1000 - 100) + 1;
		int lot = (int)(Math.random()* range) + 100;
				
		// User's Guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your guess: ");
		int guess = input.nextInt();
		input.close();
		// Seperate digits from lottery
		int lotDig1 = lot / 100;
		int lotDig2 = (lot % 100) / 10;
		int lotDig3 = lot % 10;
				 
		// Seperate digits from guess
		int guessDig1 = guess / 100;
		int guessDig2 = (guess % 100) / 10;
		int guessDig3 = guess % 10;
				 
		System.out.println("The lottery number is: " + lotDig1
		  + lotDig2 + lotDig3);
		System.out.println("Your guess was: " + guessDig1 + guessDig2 + guessDig3);	
		// Compare the guess
		if (guess == lot) // exact match
			System.out.println("Exact Match! You win $10,000.");
		// Match digits in any order
		else if (guessDig1 == lotDig1 && guessDig2 == lotDig2 && guessDig3 == lotDig3
				|| guessDig1 == lotDig1 && guessDig2 == lotDig3 && guessDig3 == lotDig2
				|| guessDig1 == lotDig2 && guessDig2 == lotDig3 && guessDig3 == lotDig1
				|| guessDig1 == lotDig2 && guessDig2 == lotDig1 && guessDig3 == lotDig3
				|| guessDig1 == lotDig3 && guessDig2 == lotDig1 && guessDig3 == lotDig2
				|| guessDig1 == lotDig3 && guessDig2 == lotDig2 && guessDig3 == lotDig1)
			System.out.println("You have all digits. You win $3,000.");
		// One digit matched
		else if (guessDig1 == lotDig1 || guessDig1 == lotDig2
				|| guessDig1 == lotDig3 || guessDig2 == lotDig1
				|| guessDig2 == lotDig2 || guessDig2 == lotDig3
				|| guessDig3 == lotDig1 || guessDig3 == lotDig2
				|| guessDig3 == lotDig3)
			System.out.println("You matched one digit. You win $1,000.");
		else
			System.out.println("Sorry, you have no matches.");
		
		}

}
