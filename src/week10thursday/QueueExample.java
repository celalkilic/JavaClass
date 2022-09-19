package week10thursday;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		//Queue classes are working in first-in-first-out data structure
		//it holds the elements by their priorities
		//PriorityQueue doesn't allow duplicated elements
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("macos");
		priorityQueue.add("window");
		priorityQueue.add("android");
		priorityQueue.add("ios");
		priorityQueue.add("linux");
		priorityQueue.add("ubuntu core");
		System.out.println(priorityQueue.peek());
		
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.element());
		
		Iterator<String> iterator = priorityQueue.iterator();
		
		
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}

	}

}
