/*
 * Savings Program
 * Naomi Keller
 * Last Updated 9/5/2019
 * This program calculates the money generated by a savings accounts over 6 months.
 */
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// Get user's savings amount
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your monthly savings: ");
		double userSavings = input.nextDouble();
				
		// Get account value
		double firstMonth = userSavings * (1 + 0.00417);
		double secondMonth = (userSavings + firstMonth) * (1 + 0.00417);
		double thirdMonth = (userSavings + secondMonth) * (1 + 0.00417);
		double fourthMonth = (userSavings + thirdMonth) * (1 + 0.00417);
		double fifthMonth = (userSavings + fourthMonth) * (1 + 0.00417);
		double sixthMonth = (userSavings + fifthMonth) * (1 + 0.00417);
				
		// Return 
		System.out.println("Your account value after six months would be: " + sixthMonth);
				
		input.close();

	}

}
