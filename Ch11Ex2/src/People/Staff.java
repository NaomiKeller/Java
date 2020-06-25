package People;

public class Staff extends Employee {
	private String title;
	
	// constructor
	public Staff(String name, String address, String phoneNumber, String emailAddress, String office, 
			double salary, String title) {
		super(name, address, phoneNumber, emailAddress, office, salary);
		this.title = title;
	}

	// accessor
	public String getTitle() {
		return title;
	}
	
	@Override
	public String toString() {
		return "Class: Staff \n"
				+ "Name: " + getName() + "\n" +
				"Address: " + getAddress() + "\n" +
				"Phone: " + getPhoneNumber() + "\n" +
				"Email: " + getEmail() + "\n" +
				"Office: " + getOffice() + "\n" +
				"Salary: " + getSalary() + "\n" + 
				"Office Hours: " + getTitle() + "\n";
	}
}
