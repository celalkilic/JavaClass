package week9Thursday;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// all set classes can only have unique values. duplicate values are not allowed
		// elements do not have index numbers
		// HashSet does not maintain insertion order, it uses hash function to store the data
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("silicone");
		hashSet.add("labs");
		hashSet.add("school");
		hashSet.add("school");
		for (String string : hashSet) {
			System.out.println(string);
		}
		System.out.println("*************");
		Iterator<String> itrIterator = hashSet.iterator();
		while (itrIterator.hasNext()) {
			String string = (String) itrIterator.next();
			System.out.println(string);
			
		}

	}

}
