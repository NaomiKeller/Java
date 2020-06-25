/*
 * Largest Row and Column Program
 * Naomi Keller
 * Last Updated 9/24/2019
 * Program generates random binary value into a matrix
 * Then finds which column and which row have the most ones in it
 */
public class Ex10 {

	public static void main(String[] args) {
		// create matrix (4-by-4)
		int[][] matrix = new int[4][4];
		
		// fill matrix with random
		for (int i = 0; i < matrix.length; i++) {
			for (int x = 0; x < matrix[i].length; x++) {
				matrix[i][x] = (int)(Math.random() * 2);
			}
		}
		
		// output
		for (int i = 0; i < matrix.length; i++) {
			for (int x = 0; x < matrix[i].length; x++) {
				System.out.print(matrix[i][x]);
			}
			System.out.println();
		}
		
		// find first row & column with most 'ones'
		System.out.println("The largest row index (0-3): " + largestRow(matrix));
		System.out.println("The largest column index (0-3): " + largestColumn(matrix));

	}
	
	// method finds first row with most 'ones'
	public static int largestRow(int[][] m) {
		int maxRowIndex = 0;
		int max = 0;
		for (int i = 0; i < m.length; i++) {
			int count = 0;
			for (int x = 0; x < m[i].length; x++) {
				if (m[i][x] == 1)
					count++;
			}
			if (count > max) {
				max = count;
				maxRowIndex = i;
			}
		}
		return maxRowIndex;
	}
	// method finds first column with most 'ones'
	public static int largestColumn(int[][] m) {
		int maxColumnIndex = 0;
		int max = 0;
		for (int col = 0; col < m[0].length; col++) {
			int count = 0;
			for (int row = 0; row < m.length; row++) {
				if (m[row][col] == 1)
					count++;
			}
			if (count > max) {
				max = count;
				maxColumnIndex = col;
			}
		}
		return maxColumnIndex;
	}
}

