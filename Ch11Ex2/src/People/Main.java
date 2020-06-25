//** This is the test program **//
/* DOCUMENTATION
 * School Personel Program
 * By Naomi Keller
 * Last Updated 10/1/2019
 * This program has 6 classes.
 * This Main class is the test input. All of the data in this class is being pushed through
 * the other classes to their appropriate designation. I have each category of class to print to ensure it works.
 * Every class is a extension of the main Person class, faculty and staff classes are extensions of employee.
 */
 
package People;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("Naomi Keller", "3941 Electra Ct.", "765-376-6225", "thatstraveling@gmail.com");
		Student student = new Student("Jimmy Neutron", "974 Main St.", "765-366-1425", "jneutron@gmail.com", "Sophomore");
		Employee employee = new Employee("Jim Halpert", "412 South St.", "765-444-8796", "jhalpert@gmail.com", "24D", 35000);
		Faculty faculty = new Faculty("Bob Bobbert", "888 Amelia Ave.", "765-314-8556", "bbobbert@gmail.com", "64D", 45000, "8AM-11AM", "Proffessor"); // lol
		Staff staff = new Staff("Tiffany Perez", "5241 North St.", "765-484-6696", "tperez@gmail.com", "88E", 30000, "Maintenance");
		
		System.out.println(person);
		System.out.println(student);
		System.out.println(employee);
		System.out.println(faculty);
		System.out.println(staff);
	}

}
