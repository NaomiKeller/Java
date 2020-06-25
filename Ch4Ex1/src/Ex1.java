/*
 * Pentagon Area Calculator
 * Naomi Keller
 * Last Updated 9/10/2019
 * The user inputs a length from center of pentagon to a vertex,
 * program calculates area from that input
 */

import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// User input for length from center to vertex
		System.out.print("Enter the length from the center of the pentagon to a vertex: ");
		double r = input.nextDouble();
	
		// Getting area
		double s = (2 * r) * Math.sin(Math.PI / 5);
		double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
		
		// Output
		System.out.printf("The area of the pentagon is %5.2f\n", area);
	}
}
