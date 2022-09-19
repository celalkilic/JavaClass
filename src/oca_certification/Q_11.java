package oca_certification;
class Vehicle {
	public void setLicensePlate() {
		System.out.println("super class");
	}
}

class Car extends Vehicle{
	
	public void setLicensePlate() { super.setLicensePlate();
	  	System.out.println("subclass"); }
	 
} 
public class Q_11 {

	public static void main(String[] args) {
		Vehicle carVehicle = new Car();
		carVehicle.setLicensePlate();

	}

}
