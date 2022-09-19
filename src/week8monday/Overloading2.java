package week8monday;

public class Overloading2 {

	public static void main(String[] args) {
		main(5);
		main("Silicone Labs");

	}
	
	public static void main(int i) {
		System.out.println("Executing main method with int parameter");
	}
	
	public static void main(String name) {
		System.out.println("Executing main method with String parameter");
	}
}