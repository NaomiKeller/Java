/*
 * Reading Score Class
 * Naomi Keller
 * Last Updated 10/10/2019
 * A class reading a text file and totaling and averaging the numbers in the file
 */

package file;
import java.io.File;
import java.util.Scanner;


public class Ex14 {

	public static void main(String[] args) throws Exception {
		// User enters file
		/** The file should already be in the directory, just enter "scores.txt" **/
		System.out.print("Enter the scores file name with extention: ");
		Scanner input = new Scanner(System.in);
		File file = new File(input.nextLine());
		input = new Scanner(file);
		
		if (!file.exists()) {
			System.out.println("File " + file + " does not exist");
			System.exit(1);
		}
		
		int count = 0;
		double total = 0;
		
		// if file exists scanner reads and sends them to 
		// the while loop to be totaled 
		try (
			Scanner inputFile = new Scanner(file);
		) {
			while (input.hasNext()) {
				total += input.nextInt();
				count++;
			}
			// then print total and return average
			System.out.println("Total: " + total);
			System.out.printf("Average: %.2f\n", ((double)total / count));
		}
	}
	
}
