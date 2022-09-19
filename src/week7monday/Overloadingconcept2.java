package week7monday;

public class Overloadingconcept2 {

	public static void main(String[] args) {
		// can we overload the main method?
		//Overloadingconcept2 obj = new Overloadingconcept2();
		main(5);
		main("slicone labs");

	}
	public static void main(int i) {
		System.out.println("executing main method with int parameter");
	}
	public static void main(String name) {
		System.out.println("executing main method with string parameter");
}
}