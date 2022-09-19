package week10thursday;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HasTableExample {

	public static void main(String[] args) {
		// Hastable class extend to dictionary class,
		//Hashtable is an array of a list. Each list is know bucket, and their positions are
		//identified by hashcode() method
		//hash table also contains key and values
		
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(4290, "ilhan");
		hm.put(4299, "micheal");
		hm.put(4300, "fatih");
		for (Map.Entry mEntry : hm.entrySet()) {
			System.out.println(mEntry.getKey()+" "+mEntry.getValue());
			
		//what is the difference between HashTable and HashMap
		//HashTable is syncronised, HashMap is not syncronised
		// Hashtable is slower,		 Hashmap is faster
		// Hashtable inherits Dictionary, Hashmap inherits AbstractMap class
		}

	}

}
