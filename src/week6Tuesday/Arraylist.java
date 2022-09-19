package week6Tuesday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList arraylst =  new ArrayList<>();
		arraylst.add(4);
		arraylst.add("string");
		arraylst.add(true);
		System.out.println(arraylst);
		arraylst.remove(1);
		System.out.println(arraylst);
		
		ArrayList arraylst2 = new ArrayList<>(Arrays.asList(2,"a",false));
		System.out.println(arraylst2);
		arraylst2.add(123);
		System.out.println(arraylst2);
		ArrayList<String> name = new ArrayList<String>();
		name.add("java");
		name.add("python");
		System.out.println(name);
		System.out.println(name.size());
		name.add(2, "f");
		System.out.println(name);
		Collections.sort(name);
		System.out.println(name);
		Collections.sort(name,Collections.reverseOrder());
		System.out.println(name);
		System.out.println(name.get(0));
		System.out.println(name.get(name.size()-1));
		
		
		
		
	}

}
