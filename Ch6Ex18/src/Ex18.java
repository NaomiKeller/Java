/*
 * Password Validator
 * Naomi Keller
 * Last Updated 9/17/2019
 * Tests strings to see if they would be valid passwords
 * given the following requirements:
 * 		- At least 8 characters
 * 		- Must contain only letters and digits
 * 		- Must contain at least 2 digits.
 */


import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Input (Enter password)
		System.out.print("Enter a password: ");
		String pass = input.nextLine();
		
		// Display Valid or Invalid
		System.out.println(
				(isValid(pass)? "Valid " : "Invalid " ) + "Password");

	}

	// Method isValid tests string to see if it meets requirements
	public static boolean isValid(String pass) {
		final int validLength = 8;
		final int minDigit = 2;
		
		boolean validPass =
				isValidLength(pass, validLength) &&
				isLettersAndDigits(pass) &&
				hasNDigits(pass, minDigit);
		
		return validPass;
	}
	
	// Method isValidLength tests if string is long enough
	public static boolean isValidLength(String pass, int validLength) {
		return pass.length() >= validLength;
	}
	
	// Method isLettersAndDigits, well you get the idea
	public static boolean isLettersAndDigits(String pass) {
		for (int i = 0; i < pass.length(); i++) {
			if (!Character.isLetterOrDigit(pass.charAt(i))) {
				return false;
			}
		}
		
		return true;
	}
	
	// Method hadNDigits tests if string has the required digits
	public static boolean hasNDigits(String pass, int n) {
		int numDig = 0;
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isDigit(pass.charAt(i))) {
			numDig++;
			}
			if (numDig >= n) {
				return true;
			}
		}
		return false;
	}
}
