package week11thursday;

public class GarbageCollection {

	public static void main(String[] args) {
		// Garbage Collection is automatic process that JRE provides for cleaning unreferenced objects
		//1) if we create anonymous abject
		//2) if we assign our reference to a null
		//3) if we assign the references to each other
		
		//anonymous object : object without a reference
		new GarbageCollection();
		
		//assign a reference to a null
		String string = new String("hey");
		string = null;
		
		// Assigning the references to each other
		
		String string2 = new String("silicone labs");
		String string3 = new String("boot camp");
		string2 = string3;

		System.out.println(string2);
		System.out.println(string3);
			
		System.gc(); // No guarantee to execute
		
	}
	@Override
	protected void finalize() throws Throwable {
	System.out.println("garbage collected");
	}

}
 