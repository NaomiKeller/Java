/*
 * Account Test
 * Naomi Keller
 * Last Updated 9/26/2019
 * Test data for the Account class as well as an output
 */
package account;

public class test {

	public static void main(String[] args) {
		// send data to account class
		Account account = new Account(1122, 20000);
		
		account.setAnnualRate(4.5);
		
		account.withdraw(2500);
		
		account.deposit(3000);
		
		// Output
		System.out.println("\n          Account Statement");
		System.out.println("==========================================");
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date created: " + account.getDate());
		System.out.printf("Balance: $%.2f\n", account.getBal());
		System.out.printf("Monthly interest: $%.2f\n", //rounded to 2 decimal
				account.getMonthlyInterest());
		
	

	}

}
