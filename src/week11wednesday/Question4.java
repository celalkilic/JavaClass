package week11wednesday;

import java.util.ArrayList;
import java.util.HashSet;

public class Question4 {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Pear");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Watermelon");
		fruits.add("Apple");
		HashSet<String> hashSet = new HashSet<String>(fruits);
		fruits.clear();
		fruits.addAll(hashSet);
		
		System.out.println(fruits);

	}

}
