package week11wednesday;

import java.util.ArrayList;

public class question1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(1);
		numbers.add(5);
		numbers.add(1); // 
		numbers.add(40);
		
		//System.out.println(numbers.get(1));

		// Remove index
		numbers.remove(3);
		
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Michael");
		nameList.add("Smith");
		nameList.add("Ahmet");
		nameList.add("Ilhan");
		nameList.add("Ilhan");
		
//		nameList.remove("Ahmet");
//		nameList.remove(2);
		
		for (String value : nameList) {
			System.out.println(value);
		}
		
		int count = 0;
		for (int i = 0; i < nameList.size(); i++) {
			
			if(nameList.get(i).equals("Ilhan")) {
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println(nameList.contains("Ahmet"));
	}

}
