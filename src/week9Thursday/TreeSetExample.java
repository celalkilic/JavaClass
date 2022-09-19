package week9Thursday;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	
	static TreeSet<String> emailSet;
	
	
	public static void main(String[] args) {
		// TreeSet does not allow duplicated value just like all the other set class
		// TreeSet store the values in ascending order or alphabetical order
		emailSet = new TreeSet<String>();
		
		emailSet.add("acanturk@gmail.com");
		emailSet.add("robert@siliconelabs.com");
		emailSet.add("bob@siliconelabs.com");
		
		//handle the elements in the TreeSet.
		for (String string : emailSet) {
			System.out.println(string);
		}
		System.out.println("**************");
		
		Iterator<String> itrIterator = emailSet.iterator();
		while (itrIterator.hasNext()) {
			String string = (String) itrIterator.next();
			System.out.println(string);
		}

	}

}
