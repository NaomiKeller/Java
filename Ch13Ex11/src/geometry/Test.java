/*
 * Geometric Object: Octogon
 * Naomi Keller
 * Last Updated 10/10/2019
 * Get area and permiter of an octogon with the side length of 5
 */

package geometry;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Octogon o1 = new Octogon(5);
		
		System.out.println("Area: " + o1.getArea());
		System.out.println("Perimeter: " + o1.getPerimeter());
		
		Octogon o2 = (Octogon)o1.clone();
		
		if (o1.compareTo(o2) == 0) {
			System.out.println("Octogon 1 and Octogon 2 are equal");
		} else {
			System.out.println("Octogon 1 and Octogon 2 are not equal");
		}
	}

}
