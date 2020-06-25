/*
 * Abstract Triangles
 * Naomi Keller
 * Last Updated 10/10/2019
 * This is the driver test for creating a triangle
 * The program take the sides for a triangle you entered 
 * and returns the perimeter, area, and you can customizer the fill and color
 */

package geometry;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// input of sides
		    System.out.print("Enter three sides of a triangle: ");
		    double s1 = input.nextDouble();
		    double s2 = input.nextDouble();
		    double s3 = input.nextDouble();
		// exception
		if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
			System.out.println("The sides must be positive values. Try again.");
			System.exit(0);
		}
		// Color input
	    System.out.print("Enter a color: ");
	    String color = input.next();
	    
	    // Filled input
	    System.out.print("Enter a filled value (T/F): ");
	    String fillString = input.next();
	    // Filled Boolean
	    boolean filled = false;
	    if (fillString.toLowerCase().equals("t")) {
	      filled = true;
	    } else if (fillString.toLowerCase().equals("f")) {
	      filled = false;
	    } else {
	      System.out.println("Invalid entry: must enter T or F.");
	      System.exit(1);
	    }

	    Triangle t = new Triangle(s1, s2, s3);
	    t.setColor(color);
	    t.setFilled(filled);
	    
	    // Output
	    System.out.println("area: " + t.getArea());
	    System.out.println("perimeter: " + t.getPerimeter());
	    System.out.println("color: " + t.getColor());
	    System.out.println("filled: " + t.isFilled());
	}

}
