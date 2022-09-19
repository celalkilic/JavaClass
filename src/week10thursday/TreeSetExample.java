package week10thursday;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	static TreeSet<String> emailSet;
	public static void main(String[] args) {
		//treeSet doesn't allow duplicated value just like all the other set classes
		//treeSet store the values in ascending order or alphabetic order
		emailSet = new TreeSet<>();
		
		emailSet.add("acturkkus@gmail.com");
		emailSet.add("robert@siliconelabs.com");
		emailSet.add("bob@siliconelabs.com");
		
		
		emailSet.removeIf(x_aiff ->x_aiff.startsWith("a"));
		//Handle the elements in treeSet.
		//forEach Loob
		for (String string : emailSet) {
			System.out.println(string);
		}
		//print the treeSet with iterator
		Iterator<String> iterator = emailSet.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
	}

}
