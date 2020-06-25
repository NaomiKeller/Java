package People;

public class Person {
	// Declaration
	private String name, address, phoneNumber, email;
	
	// Constructors
	public Person(String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	// Accessors
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		// I wasn't sure if we were only supposed to return name and class but I just wanted
		// to return all fields. more satisfying that way, and that way i make sure everything works.
		return "Class: Person \n"
				+ "Name: " + getName() + "\n" +
				"Address: " + getAddress() + "\n" +
				"Phone: " + getPhoneNumber() + "\n" +
				"Email: " + getEmail() + "\n";
	}
}