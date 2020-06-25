import java.util.ArrayList;
/* 
 * Radix Sort
 * Naomi Keller
 * 11/12/2019
 * Randomly generate 1M integers and radix sorts them
 */
public class Ex12 {
	public static void main (String[] args) {
		int maxOrder = 1000000; // amount of int
		int[] list = new int[1000000];
		for (int i=0; i<list.length;i++) {
			list[i] = (int) (Math.random() * maxOrder);
		}
		radixSort(list,maxOrder);
	}
	
	 static void radixSort(int[] list, int maxOrder) {
		  for (int order = 1; order < maxOrder; order *= 10) {
		   @SuppressWarnings("unchecked")
		   ArrayList<Integer>[] bucket = new ArrayList[10];
		   
		   for (int i = 0; i < bucket.length; i++) {
		    bucket[i] = new java.util.ArrayList<>();
		   }
		   
		   for (int i = 0; i < list.length; i++) {
		    bucket[(list[i] / order) % 10].add(list[i]);
		   }
		   
		   int k = 0;
		   for (int i = 0; i < bucket.length; i++) {
		    if (bucket[i] != null) {
		     for (int j = 0; j < bucket[i].size(); j++)
		      list[k++] = bucket[i].get(j);
		    }
		   }
		 }
	}
}