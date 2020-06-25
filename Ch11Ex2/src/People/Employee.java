package People;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends Person {
	private String office;
	private double salary;
	private Date dateHired;

	// constructors
	public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		dateHired = new Date();
	}
	
	// accessors
	public String getOffice() {
		return office;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Date getDateHired() {
		return dateHired;
	}
	
	@Override
	public String toString() {
		return "Class: Employee \n"
				+ "Name: " + getName() + "\n" +
				"Address: " + getAddress() + "\n" +
				"Phone: " + getPhoneNumber() + "\n" +
				"Email: " + getEmail() + "\n" +
				"Office: " + getOffice() + "\n" +
				"Salary: " + getSalary() + "\n" ;
	}
}
