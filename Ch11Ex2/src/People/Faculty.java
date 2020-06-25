package People;

public class Faculty extends Employee {
	private String officeHours;
	private String rank;
	
	// constructors
	public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, 
			double salary, String officeHours, String rank) {
		super(name, address, phoneNumber, emailAddress, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	// accessors
	public String getOfficeHours() {
		return officeHours;
	}
	public String getRank() {
		return rank;
	}
	
	@Override
	public String toString() {
		return "Class: Faculty \n"
				+ "Name: " + getName() + "\n" +
				"Address: " + getAddress() + "\n" +
				"Phone: " + getPhoneNumber() + "\n" +
				"Email: " + getEmail() + "\n" +
				"Office: " + getOffice() + "\n" +
				"Salary: " + getSalary() + "\n" + 
				"Office Hours: " + getOfficeHours() + "\n" +
				"Rank: " + getRank() + "\n";
	}
}
