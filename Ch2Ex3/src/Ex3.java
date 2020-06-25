/*
 * Feet to Meters conversion program
 * Naomi Keller
 * Last Updated 9/5/2019
 * Converts a length from feet to meters.
 */

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		// Get user's number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a length in feet: ");
		double feet = input.nextDouble();
		
		// Get conversion
		double meters = feet * 0.305;
		
		// Return conversion
		System.out.println(feet + " feet equals " + meters + " meters.");
		
		input.close();
	}
}