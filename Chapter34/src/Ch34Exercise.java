import java.sql.*;

public class Ch34Exercise {
  public static void main(String[] args)
      throws SQLException, ClassNotFoundException {
    // Load the JDBC driver
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		// was "com.mysql..cj.jdbc.Driver"
    System.out.println("Driver loaded");

    
    String msAccDB = "Databases.accdb";
    String dbURL = "jdbc:ucanaccess://" + msAccDB; 

    // Step 2.A: Create and 
    // get connection using DriverManager class
    Connection connection = DriverManager.getConnection(dbURL); 
    // Create a statement
    Statement statement = connection.createStatement();

    // Execute statement
    ResultSet resultSet1 = statement.executeQuery
    ("select firstName, mi, lastName from Student where lastName = 'Smith' or lastName = 'Keller' order by lastName");
    // Iterate through the result and print the student names
    System.out.println("\nStudents named Smith and Keller:");
    while (resultSet1.next())
      System.out.println(resultSet1.getString(1) + "\t" + resultSet1.getString(2) + "\t" + resultSet1.getString(3));
    
    // Display courses
    System.out.println("\nCourses available:");
    ResultSet resultSet2 = statement.executeQuery
    ("select courseId, subjectId, courseNumber, title from Course order by subjectId, courseNumber");
    while (resultSet2.next())
      System.out.println(resultSet2.getString(1) + "\t" + resultSet2.getString(2) + "\t" + resultSet2.getString(3) + "\t" + resultSet2.getString(4));
    
    // Execute statements
    System.out.println("\nStudent enrollment report:");
    ResultSet resultSet3 = statement.executeQuery
    ("select  Student.lastName, Student.firstName,"
    		+ " Enrollment.courseId from Student"
    		+ " inner join Enrollment on Student.ssn = Enrollment.ssn");
    // Iterate through the result and print the student names
    while (resultSet3.next())
      System.out.println(resultSet3.getString(1) + "\t" + resultSet3.getString(2) + "\t" + resultSet3.getString(3));
    
 // Display roster 
    // I was going to list the course columns first and then the names since it sorts
    // by list, but the course titles are so long it broke the formatting.
    System.out.println("\nCourse roster:");
    ResultSet resultSet4 = statement.executeQuery
    ("select  Student.lastName, Student.firstName,"
    		+ " Course.subjectId, Course.courseNumber, Course.title from Student"
    		+ " inner join Enrollment on Student.ssn = Enrollment.ssn inner join Course on Course.courseId = Enrollment.courseId"
    		+ " order by title, lastName");
    // Iterate through the result and print the student names
    while (resultSet4.next())
      System.out.println(resultSet4.getString(1) + "\t" + resultSet4.getString(2) + "\t" + resultSet4.getString(3) + "\t" + resultSet4.getString(4) + "\t" + resultSet4.getString(5));
    




    // Close the connection
    connection.close();
  }
}
