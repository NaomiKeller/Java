import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter point 1 (format: 'latitude longitude':) in degrees: ");
		double p1Lat = input.nextDouble();
		double p1Long = input.nextDouble();
		System.out.print("Enter point 2 (format: 'latitude longitude':) in degrees: ");
		double p2Lat = input.nextDouble();
		double p2Long = input.nextDouble();
        
        double d = 6371.01 * Math.acos(
        		Math.sin(Math.toRadians(p1Lat)) *
        		Math.sin(Math.toRadians(p1Long)) +
        		Math.cos(Math.toRadians(p1Lat)) *
        		Math.cos(Math.toRadians(p1Long)) *
        		Math.cos(Math.toRadians(p2Long) - Math.toRadians(p2Lat))
        		);
    
        System.out.printf("The distance between the two points is %f km.%n", d); 
				

	}

}
