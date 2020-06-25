/*
 * 10 Distinct Numbers
 * Naomi Keller
 * Last Updated 9/19/2019
 * Displays unique numbers from an array of 10 numbers given by user
 * e.g., if user enters '2' twice it will show '2' once.
 */

import java.util.Scanner;

public class Ex5 {
	// Main
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Declare variables
		int[] distinctNumbers = new int[10]; // Array to store all numbers
		int num; 				// User input
		int count = 0;			// Number of distinct numbers

		// Prompt the user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			num = input.nextInt();

			// Test if num is distinct
			if (isDistinct(distinctNumbers, num)) {
				distinctNumbers[count] = num;
				count++;
			}
		}

		/* Displays the number of distinct numbers and the  
		   distinct numbers separated by spaces */
		System.out.println("The number of distinct numbers is " + count);
		System.out.print("The distinct numbers are");
		for (int i = 0; i < distinctNumbers.length; i++) {
			if (distinctNumbers[i] > 0)
				System.out.print(" " + distinctNumbers[i]);
		}
		System.out.println();
	}

	// Method isDistinct returns true if number is not in array false otherwise 
	public static boolean isDistinct(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) 
				return false;
		}
		return true;
	}
}