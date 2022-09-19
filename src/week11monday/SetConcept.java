package week11monday;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcept {

	public static void main(String[] args) {
		//items will not be the same as they are added.
		Set<String>animalSet = new HashSet<String>();
		
		//items will be the same as they are added.
		animalSet =new LinkedHashSet<String>();
		
		//items will be sorted in natural order (alphabetically)
		animalSet = new TreeSet<String>();
		animalSet.add("dog");
		animalSet.add("cat");
		animalSet.add("bird");
		animalSet.add("snake");
		animalSet.add("butterfly");
		animalSet.add("fish");
		animalSet.add("kever");
		animalSet.add("cat");
		
		System.out.println(animalSet);

	}

}
