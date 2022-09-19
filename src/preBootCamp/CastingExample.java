package preBootCamp;

public class CastingExample {

	public static void main(String[] args) {
		// Casting : Converting data types into different data types
		
			int x = 10;
			// widening casting
			System.out.println((double)x);
				
			// narrowing casting
			double y = 42.98;
			System.out.println((int)y);
			// Numeric data types : byte, short, int, long, float, double
				
			boolean myBoolean = true;
			// We can not cast numeric data types into boolean
			System.out.println(myBoolean);
	}

}
