package abstractClasses;

public class Car extends Vehicle {
	private int yearMade;
	public Car() {
		
	}
	public Car(double mph, int yearMade) {
		super(mph, yearMade);
		this.yearMade = yearMade;
	}
	
	public double getMaxMph() {
		return maxMph;
	}
	
	public void setMaxMph(double mph) {
		maxMph = mph;
	}
}
