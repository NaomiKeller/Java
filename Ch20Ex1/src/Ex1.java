/*
 * Sorting Words Program
 * Naomi Keller
 * 11/5/2019
 * Pass a text file through the command line arguments, and sort
 * the contained words alphabetically.
 */


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.PriorityQueue;

public class Ex1 {
	public static void main(String[] args) throws IOException {
		
		// Check number of arguments passed
		if (args.length != 1) {	
			System.out.println("Usage: java Exercise_20_01 TextFile");
			System.exit(1);
		}
		// Check if file exists
		File textFile = new File(args[0]);
		
		// Error checking: Exits if no file.
		if (!textFile.exists()) {
			System.out.println("File " + textFile.getName() + " doesn't exist");
			System.exit(2);
		}
		
		if (!textFile.isFile()) {
			System.out.println(textFile.getName() + " is a directory");
			System.exit(3);
		}
		// Reading file with Scanner
		try (
		 Scanner input = new Scanner(textFile);		
		) { // Using PriorityQueue to sort
			PriorityQueue<String> queue = new PriorityQueue<>();
			while (input.hasNext()) {
				queue.offer(input.next());
			}
			while (queue.size() > 0) {
				System.out.println(queue.poll());
			}
		}
		
	}
}
