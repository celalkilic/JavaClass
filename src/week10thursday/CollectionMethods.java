package week10thursday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMethods {

	public static void main(String[] args) {
		// adAll method : adds whole list to another list
		List<String> list = new ArrayList<String>(Arrays.asList("C","C#","Gherkin","Python","z"));
		Collections.addAll(list, "java","javascript","pascal");
		
		//collection.max()
		System.out.println(Collections.max(list));
		
		//collection.min()
		
		System.out.println(Collections.min(list));
		
		
	}

}
