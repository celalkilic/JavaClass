package week6monday;

public class ConstructorConcept {
	// No return type for Constuctors
		// What kind of constructors we have?
		// Default, Non parameterized, Parameterized
		
		int x;
		
		public ConstructorConcept() {
			x = 10;
		}

	public static void main(String[] args) {
		ConstructorConcept cc = new ConstructorConcept();
		System.out.println(cc.x);
	}

}
