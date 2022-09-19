package week9Thursday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// Arrays are static(fixed) sized, but array list is dynamic sized
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(4298, 4299, 4300));
		System.out.println(list);
		list.add(4230);
		list.size();
		list.set(0, 4296);
		list.remove(0);
		Collections.sort(list);
		System.out.println(list);

	}

}
