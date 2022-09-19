package week10thursday;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	static LinkedHashSet<Integer> linkedHashSet;
	public static void main(String[] args) {
		// LinkedHashSet maintains insertion order, and it doesn't allow duplicates elements
		linkedHashSet = new LinkedHashSet<Integer>(Arrays.asList(3,5,7,3,2,1));
		System.out.println(linkedHashSet);
	}

}
