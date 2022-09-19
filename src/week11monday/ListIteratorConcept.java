package week11monday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListIteratorConcept {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = 
		new ArrayList<String>(Arrays.asList("Lisa", "Ahmet", "Michael", "John"));
		
		ListIterator<String> itr = names.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		System.out.println(itr.previous());
		
		
	}

}