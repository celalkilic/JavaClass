package week10thursday;

import java.util.Arrays;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Vector is synchronised class, and it has legacy methods in it.
		// That’s why it is relatively slower than arraylist and linkedlist
		Vector<Integer> vector = new Vector<Integer>(Arrays.asList(1,2,3,4,5));
		vector.add(9);
		vector.get(0);
	}

}
