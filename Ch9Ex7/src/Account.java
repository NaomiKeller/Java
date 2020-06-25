import java.util.Date;

public class Account {
	// declare variables
	private int id;
	private double bal; //balance
	private double annualRate; // annualInterestRate
	private Date dateCreated;
	
	/** CONSTRUCTORS **/
	// Default account
	Account() {
		id = 0;
		bal = 0;
		annualRate = 0;
		dateCreated = new Date();
	}
	
	Account(int newId, double newBal) {
		id = newId;
		bal = newBal;
		dateCreated = new Date();
	}
	
	/** MUTATORS **/
	// set id
	public void setId(int newId) {
		id = newId;
	}
	
	// set balance
	public void setBal(int newBal) {
		bal = newBal;
	}
	
	// set annual interest
	public void setAnnualRate(int newRate) {
		annualRate = newRate;
	}
	
	/** ACCESSORS **/
	// return id
	public int getId() {
		return id;
	}
	
	// return balance
	public double getBal() {
		return bal;
	}
	
	// return annual interest
	public double getRate() {
		return annualRate;
	}
	
	// convert date to string and return
	public String getDate() {
		return dateCreated.toString();
	}
	
	// return monthly interest rate
	public double getMonthlyRate() {
		return annualRate / 12;
	}
	
	/** METHODS **/
	// monthly interest 
	public double getMonthlyInterest() {
		return bal * (getMonthlyRate() / 100);
	}
	
	// withdraw
	public void withdraw(double amount) {
		bal -= amount;
	}
	
	// deposit
	public void deposit(double amount) {
		bal += amount;
	}

}
