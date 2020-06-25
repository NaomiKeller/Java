/*
 * 10 Distinct Numbers 2.0
 * Naomi Keller
 * Last Updated 9/19/2019
 * User enters 10 numbers, program deletes any duplicate numbers
 * and returns the result.
 */

import java.util.Scanner;

public class Ex15 {
	// Main
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10]; // Array to store all numbers

		// Prompt the user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++)
			numbers[i] = input.nextInt();
			
		int[] distinctNumbers = eliminateDuplicates(numbers);

		// Output
		System.out.print("The distinct numbers are: ");
		for (int e: distinctNumbers) {
			if (e>0)
				System.out.print(" " + e);
		}
		System.out.println();
		}
	// returns full array without the dupes
	public static int[] eliminateDuplicates(int[] list) {
		int[] distinctList = new int[list.length];
		int i=0; 
		for (int e: list) {
			if (search(distinctList, e) == -1 ) {
				distinctList[i] = e;
				i++;
			}
		}
		return distinctList;
	}
	
	// tells elimnateDuplicates if a value is duplicate
	public static int search(int[] array, int key) {
		for (int i=0; i < array.length; i++) {
			if (key == array[i])
				return i;
		}
		return -1;
	}
}