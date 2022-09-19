package week6monday;

public class ConstructorConcept3 {

	int x;
	
	public ConstructorConcept3() {
		System.out.println("Calling no parameter constructor");
	}
	
	public ConstructorConcept3(int number) {
		System.out.println("The " + number + " value has been assigned to x.");
		x = number;
	}

	public static void main(String[] args) {
	ConstructorConcept3 cc = new ConstructorConcept3();
		
		ConstructorConcept3 cc2 = new ConstructorConcept3(25);
		System.out.println(cc2.x);

	}

}
