package week10thursday;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
//all set classes can only have unique values. duplicate values are not allowed.
//elements doesn't have index numbers
//HasSet doesn't maintain insertion order, it uses hash function to store the data
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("silicone");
		hashSet.add("labs");
		hashSet.add("school");
		
		for (String string : hashSet) {
			System.out.println(string);
		}
		//iterating trough the hashset
		
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

}
