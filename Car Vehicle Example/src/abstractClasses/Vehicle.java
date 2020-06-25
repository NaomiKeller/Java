package abstractClasses;

public abstract class Vehicle {
	protected double maxMph;
	
	// constructor
	public Vehicle() {
		maxMph=0;
	}
	
	public Vehicle(double mph, int yearMade) {
		maxMph = mph;
	}
	
	public abstract double getMaxMph();
	public abstract void setMaxMph(double mph);
}
