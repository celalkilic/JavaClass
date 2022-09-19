package week10thursday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// Arrays are static(fixed) sized, but array list is dynamic sized
				ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4298,4299,4300));
				
				list.add(4230); // adding value all the way end
				System.out.println(list.get(3)); // getting the value
				list.add(0, 4297);// adding value to the specific index number
				list.size(); // size method returns the size of the arraylist : 5
				list.set(0, 4296); // This one erases the value at given index number and replace with the new one
				list.remove((Integer)4296);// Removing the element
				//list.clear(); // removes all elements from the arraylist
				// If you want to sort the list, use Collection.sort() method
				System.out.println(list);
				
				Collections.sort(list); // Sorting the list
				System.out.println(list);
		
		
	}

}
