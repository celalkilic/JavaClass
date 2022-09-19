package week10thursday;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("silicone");
		linkedList.add("labs");
		linkedList.add("school");
		
		linkedList.set(2, "company");
		System.out.println(linkedList);
		System.out.println(linkedList.get(0));

	}

}
