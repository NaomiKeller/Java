/* Compare Performance
 * Naomi Keller
 * 11/21/2019
 * 
    Randomly generates 500,000 integers and inserts them into a BST, and
    Does the same thing for an AVLTree, and
    Compares the execution time of the two.

 */

package binaryTree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Ex2 {

 public static void main(String[] args) {
  ArrayList<Integer> data = new ArrayList<>();
  for (int i = 0; i < 500000; i++) {
   data.add(i);
  }
  Collections.shuffle(data);

  AVLTree<Integer> avlTree = new AVLTree<>();
  BST<Integer> bst = new BST<>();
  
  long time = System.currentTimeMillis();
  for (Integer integer : data) {
   bst.insert(integer);
  }
  System.out.println("BST insert = " + (System.currentTimeMillis() - time));
  
  time = System.currentTimeMillis();
  for (Integer integer : data) {
   avlTree.insert(integer);
  }
  System.out.println("AVLTree insert = " + (System.currentTimeMillis() - time));

  Collections.shuffle(data);
  
  time = System.currentTimeMillis();
  for (Integer integer : data) {
   bst.search(integer);
  }
  System.out.println("BST search = " + (System.currentTimeMillis() - time));

  time = System.currentTimeMillis();
  for (Integer integer : data) {
   avlTree.search(integer);
  }
  System.out.println("AVLTree search = " + (System.currentTimeMillis() - time));

 }

}