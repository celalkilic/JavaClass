package week11monday;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorConcept {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i < 11; i++) {
			numbers.add(i);
		}
		
		Iterator<Integer> itr = numbers.iterator();
		
		// System.out.println("Using next method");
		// System.out.println(itr.next());
		
		// hasNext() check if there is an element
		while(itr.hasNext()) {
			
			// move to the next element
			int i = itr.next();
			
			System.out.println(i);
			
			// Remove odd numbers
			if(i % 2 != 0)
				itr.remove();
				
		}
		
		System.out.println(numbers);
		
		
		
		
	}

}
