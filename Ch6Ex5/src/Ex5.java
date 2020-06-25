/*
 * Number sorter
 * Naomi Keller
 * Last Updated 9/17/2019
 * Sorts three numbers given by user by increasing order
 */

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//User input (three numbers)
		System.out.print("Enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		//Output
		displaySort(num1, num2, num3);
	}
	
	//displaySort method
	//reassigns num1-3 to be in increasing order
	public static void displaySort(
			double num1, double num2, double num3) {
		//x is a for temporarily holding different nums
		double x;
		
		if (num2 < num1 && num2 < num3) {
			x = num1;
			num1 = num2;
			num2 = x;
		}
		else if (num3 < num1 && num3 < num2) {
			x = num1;
			num1 = num3;
			num3 = x;
		}
		if (num3 < num2) {
			x = num2;
			num2 = num3;
			num3 = x;
		}
		//Output
		System.out.println(num1 + " " + num2 + " " + num3);
	}
}
