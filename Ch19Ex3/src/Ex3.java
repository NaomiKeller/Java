/* Distinct Elements
 * Naomi Keller
 * 10/31/2019
 * Creates a list containing non-duplicate elements from original list.
 */

import java.util.ArrayList;

public class Ex3 {
	public static void main(String[] args) {
		// Creating original list
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
	    list.add(52);
	    list.add(17);
	    list.add(17);
	    list.add(72);
	    list.add(12);
	    list.add(52);
	    
	    // Output after duplicates have been removed
	    for (int i: removeDuplicates(list)) {
	    	System.out.println(i);
	    }
	    
	}
	
	// Removing duplicates:
	// A new array is created "noDupe"
	// As it iterates through the list it checks if the element if already
	// in noDupe or not. If it isn't it adds it.
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		ArrayList<E> noDupe = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			E elem = list.get(i);
			if (!noDupe.contains(elem)) {
				noDupe.add(elem);
			}
		}
		return noDupe;
	}
}
