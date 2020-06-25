package binaryTree;
/*"Find the Leaves"
 * Naomi Keller
 * 11/21/2019
 * Return number of leaf nodes in BST
 */
public class Ex6 {
	public static void main(String[] args) {
		Integer[] numbers = {60, 55, 45, 47, 59, 100, 76, 107, 101};
		
		// Create Integer BST
		BST<Integer> intTree = new BST<>(numbers);

		// Traverse tree postorder
		System.out.println("Number of leaf nodes: " + 
			intTree.getNumberOfLeaves());
	}
}