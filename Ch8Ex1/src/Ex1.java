/*
 * Sum Column Program
 * Naomi Keller
 * Last Updated 9/24/2019
 * User inputs number for a matrix, 
 * the program then returns the sum of the columns
 */

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// read matrix
		double[][] matrix = getMatrix();
		
		// sum of each column
		for (int col = 0; col < matrix[0].length; col++) {
			System.out.println(
					"Sum of elements at column " + col +
					" is " + sumColumn(matrix, col));
		}

	}
	
	// initializes an array with user input
	public static double[][] getMatrix() {
		// initialize input
		Scanner inp = new Scanner(System.in);
		final int ROWS = 3;
		final int COLUMNS = 4;
		double[][] m = new double[ROWS][COLUMNS];
		
		// user input
		System.out.println("Enter a " + ROWS + "-by-" + COLUMNS + " matrix row by row (format: '# # # #')");
		for (int row = 0; row < m.length; row++)
			for (int col = 0; col < m[row].length; col++)
				m[row][col] = inp.nextDouble();
		return m;
				
	}
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int row = 0; row < m.length; row++) {
			sum += m[row][columnIndex];
		}
		return sum;
	}
}
