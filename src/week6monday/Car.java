package week6monday;

public class Car {

	int modelYear;
	String modelName;
	
	public Car(int modelYear, String modelName) {
		this.modelName = modelName;
		this.modelYear = modelYear;
	}

	public static void main(String[] args) {
		
		Car car = new Car(2018, "Toyota");
		System.out.println(car.modelYear + " " + car.modelName);
	}

}
