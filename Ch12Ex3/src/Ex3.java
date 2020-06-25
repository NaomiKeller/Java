/*
 * Random Index
 * Naomi Keller
 * Last Updated 10/10/2019
 * Program generates an array with 101 random values, 
 * user can enter an index and get the value for that index
 */

import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  
	  int[] nums = getRandom(100);
	  int index = -1;
	  while (index < 100) { // User can continue entering indexes until they enter out of bounds value
		  System.out.print("Enter an array index from 0 to 100. Enter a value out of bounds to exit: ");
		  
		  
		  // Close the program if the index provides an error
		  try {
			  index = input.nextInt();
		  } catch (Exception e) {
			  System.out.println("Error: Incorrect input.");
			  System.exit(1);
		  }
		  
		  try {
			  System.out.println("The value is " + nums[index]);
		  } catch (Exception e) {
			  System.out.println("Out of bounds, goodbye");
			  System.exit(2);
		  }
	  }
  }
  // Generate random numbers through the length of the int[] array.
  public static int[] getRandom(int size) {
	  int[] nums = new int[size];
	  for (int i = 0; i < nums.length; i++) {
		  nums[i] = (int)(Math.random() * size);
	  }
	  return nums;
  }
}