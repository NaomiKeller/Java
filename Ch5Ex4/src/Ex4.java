/*
 * Miles to Kilometers Table
 * Naomi Keller
 * Last Updated 9/10/2019
 * Displays the conversion of miles to kilometers in a table up to 16 miles.
 */
public class Ex4 {

	public static void main(String[] args) {
		// constant; conversion rate
		final double kiloInMile = 1.609;
		
		// table header
		System.out.println(
				"Miles        Kilometers");
		
		// create table
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%-13d%-10.3f\n", i, (i * kiloInMile));
		}
		
	}

}
