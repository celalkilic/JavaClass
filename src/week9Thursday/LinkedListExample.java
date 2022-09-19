package week9Thursday;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// ArrayList is using dynamic array algorithm but linked list using doubly LinkedList algorithm
		// in LikedList manipulation is faster than ArrayList
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("silinone");
		linkedList.add("labs");
		linkedList.add("school");
		linkedList.set(0, "company");
		System.out.println(linkedList);
		System.out.println(linkedList.get(0));
	}

}
