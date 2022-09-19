package week9Thursday;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	static LinkedHashSet<Integer> iLinkedHashSet; 
	public static void main(String[] args) {
		// LinkedHashSet maintain insertion order, and it does not allow duplicates elements
		
		iLinkedHashSet = new LinkedHashSet<Integer>(Arrays.asList(2,2,1,3,6,5,4,7));
		System.out.println(iLinkedHashSet);
		System.out.println("**************");
		Iterator<Integer> itrIterator = iLinkedHashSet.iterator();
		while (itrIterator.hasNext()) {
			Integer integer = (Integer) itrIterator.next();
			System.out.print(integer+" ");
		}
		

	}

}
