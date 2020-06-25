/*
 * The Triangle Class
 * Naomi Keller
 * Last Updated 10/3/2019
 * A allowing for use of the GeometricObject class with calculating the area of a triangle
 */
package geometry;
// I started over at one point but could not fully delete the 
// Ch11Ex1 project so this project's name is in a different format
import geometry.GeometricObject;

import java.util.Scanner;

public class triangleClass {
    public static void main(String[] args) {
    	// the main displays interface for user input as well as assigning variables from the other methods
        double[] sides = promptDoubleValues(3); // 3 would be the default value (1+1+1)
        String color = promptStringValue();
        boolean filled = promptBooleanValue();
        Triangle triangle = new Triangle(sides[0], sides[1], sides[2]);
        triangle.setColor(color);
        triangle.setFilled(filled);
        System.out.println("Area:      " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color:     " + triangle.getColor());
        System.out.println("Filled:    " + triangle.isFilled());
    }
    // user input for fill
    private static boolean promptBooleanValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter [T]rue' for filled, or [F]alse for unfilled: ");
        return scanner.nextLine().toUpperCase().charAt(0) == 'T';
    }
    // user input for sides of the triangle
    private static double[] promptDoubleValues(int size) {
        double[] values = new double[size];
        final Scanner SCANNER = new Scanner(System.in);
        System.out.print("Enter " + size + " sides: ");
        // loop for getting all three sides
        for (int i = 0; i < size; i++) {
            values[i] = SCANNER.nextDouble();
        }
        return values;
    }
    // 
    private static String promptStringValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a color: ");
        return scanner.nextLine();
    }
    // extending GeometricObject for use with Triangle data
    static class Triangle extends GeometricObject {
    	// the next several lines declare sides as doubles, 
    	// are assigned to Triangle() and are then accessed
        private final double side1;
        private final double side2;
        private final double side3;

        public Triangle() {
            this(1.0, 1.0, 1.0); // default values
        }

        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        // accessors
        public double getSide1() {
            return side1;
        }

        public double getSide2() {
            return side2;
        }

        public double getSide3() {
            return side3;
        }

        // Overidden methods for string conversion, area, and perimeter calculation
        @Override
        public String toString() {
            return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                    " side3 = " + side3;
        }

        public double getArea() {
            double s = getPerimeter() / 2.0;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        public double getPerimeter() {
            return side1 + side2 + side3;
        }
    }
}