package People;
/**
 * 
 * @author ekeller15
 * @version 1.2
 * Default constructor extends person
 */

public class Student extends Person {
	
	// constants
	public static final String FRESHMAN = "Freshman";
	public static final String SOPHOMORE = "Sophomore";
	public static final String JUNIOR = "Junior";
	public static final String SENIOR = "Senior";
	
	// instanced
	private String classStatus;
	/**
	 * Get data of class
	 * @param name 
	 * @param address
	 * @param phoneNumber
	 * @param emailAddress
	 * @param classStatus
	 */
	// Constructor
	public Student(String name, String address, String phoneNumber, String emailAddress, String classStatus) {
		super(name, address, phoneNumber, emailAddress);
		this.classStatus = classStatus;
	}
	/**
	 * 
	 * @return classStatus
	 */
	// Accessor
	public String getClassStatus() {
		return classStatus;
	}
	
	
	@Override
	public String toString() {
		// I wasn't sure if we were only supposed to return name and class but I just wanted
		// to return all fields. more satisfying that way, and that way i make sure everything works.
		return "Class: Student \n"
				+ "Name: " + getName() + "\n" +
				"Address: " + getAddress() + "\n" +
				"Phone: " + getPhoneNumber() + "\n" +
				"Email: " + getEmail() + "\n" +
				"Status: " + getClassStatus() + "\n";
	}
}