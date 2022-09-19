package week11thursday;

import java.util.ArrayList;

public class Wrapperclasses_3 {

	public static void main(String[] args) {
		// unboxing Autoboxing
		
		// Unboxing is converting object to primitive data type
		//Autoboxing is converting primitive data type to object
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(9); // Autoboxing : Primitive 9 turns into Integer object
		int a = 4298;
		arrayList.add(a);
		int number = arrayList.get(0); // Unboxing : arrayList element will be stored in primitive variable
	}

}
