/* Top and Second Student Program
 * Naomi Keller
 * Last Updated 9/10/2019
 * Program allows user to enter students' names and scores
 * it finds the first and second highest scores and displays
 * those top two students' names and score.
 */

import java.util.Scanner;
public class Ex9_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int studentCount = input.nextInt();
		input.nextLine();
		
		// declaring vars
		String topName = null;
		double topScore = 0;
		String secondName = null;
		double secondScore = 0;
		
		// loop for user input
		for (int i = 0; i < studentCount; i++) {
			System.out.print("Enter the name for student #" + (i + 1) + ": ");
			String s = input.next();
			
			System.out.print("Enter the score for student #" + (i + 1) + ": ");
			double score = input.nextDouble();
			
			// if/else compares each score, if one score is higher than 
			// the last it is the new high score
			if (score > topScore) {
				if (topName != null) {
					secondName = topName;
					secondScore = topScore;
				}
				topName = s;
				topScore = score;
			} else if (score > secondScore) {
				secondName = s; 
				secondScore = score;
			}
		}
		System.out.println("The top student was " + topName + " with a score of " + topScore);
		System.out.println("The second student was " + secondName + " with a score of " + secondScore);
	}

}
