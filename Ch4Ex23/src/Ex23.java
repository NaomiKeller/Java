/* Employee Pay Rates Program
 * Naomi Keller
 * Last Updated 9/12/2019
 * Program allows user to enter employees' names and rates
 * it finds their net pay bases on pay rate, hours worked
 * and tax deductions.
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		// User input
		System.out.print("Enter employee's name: ");
		String name = input.next();
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double hourlyPay = input.nextDouble();
		System.out.print("Enter federal tax rate: ");
		double fedTax = input.nextDouble();
		System.out.print("Enter state tax rate: ");
		double stateTax = input.nextDouble();
		
		// Calculation
		double grossPay, fed, state, totalDeduct, net;
		grossPay = hoursWorked * hourlyPay;
		state = grossPay * stateTax;
		fed = grossPay * fedTax;
		totalDeduct = fed + state;
		net = grossPay - totalDeduct;
		// I could not figure out printf with %.2f, I kept getting errors,
		// so I did this instead
		grossPay = Math.round(grossPay * 100.0) / 100.0;
		state = Math.round(state * 100.0) / 100.0;
		totalDeduct = Math.round(totalDeduct * 100.0) / 100.0;
		net = Math.round(net * 100.0) / 100.0;
		
		// Output
		System.out.print(
				"Employee Name: " + name +
				"\nHours Worked: " + hoursWorked +
				"\nPay Rate: $" + hourlyPay + 
				"\nGross Pay: $" + grossPay + 
				"\nDeductions: " + 
				"\n  Federal Witholding (20.0%): $" + fed + 
				"\n  State Witholding (9.0%): $ " + state +
				"\n  Total Deduction: $" + totalDeduct +
				"\nNet Pay: $" + net
				); 
	}

}
