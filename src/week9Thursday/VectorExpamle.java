package week9Thursday;

import java.util.Arrays;
import java.util.Vector;

public class VectorExpamle {

	public static void main(String[] args) {
		// Vector is synchronise class and it has legacy methods in it
		// that is why it is relatively slower than ArrayList and LinkedList
		Vector<Integer> vector = new Vector<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		vector.add(8);
		vector.get(3);
		System.out.println(vector);

	}

}
