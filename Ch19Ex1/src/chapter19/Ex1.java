/*
 * ArrayList to Array
 * Naomi Keller
 * 10/31/2019
 * Implements and modifies an ArrayList "GenericStack"
 */

package chapter19;

public class Ex1 {
	public static void main(String[] args) {
		// Stack for strings
		GenericStack<String> s1 = new GenericStack<>();
		s1.push("London");
		s1.push("Denver");
		s1.push("Paris");
		s1.push("Miami");
		s1.push("Seoul");
		s1.push("Tokyo");
		
		// Stack of 100 integers
		GenericStack<Integer> s2 = new GenericStack<>();
		for (int i = 0; i < 100; i++) {
			s2.push(i + 1);
		}
		// Display Stack 1
		System.out.print("Stack 1: ");
		while (!s1.isEmpty()) {
			System.out.print(s1.pop() + " ");
		}
		System.out.println("\n");
		
		// Display stack 2
		System.out.println("Stack 2: ");
		for (int i = 1; !s2.isEmpty(); i++) {
			if (i % 10 == 0)
				System.out.println(s2.pop());
			else
				System.out.println(s2.pop() + " ");
		}
		System.out.println();
	}
}
		