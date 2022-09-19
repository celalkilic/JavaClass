package week11monday;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListConcept {

	public static void main(String[] args) {
		
		List<String> values = new ArrayList<String>();
		
		values = new LinkedList<String>();
		values.add("Smith");
		values.add("Jackson");
		values.add("Lisa");
		values.add("John");
		
		for (String string : values) {
			System.out.println(string);
		}
		
		values = new Vector<String>();
		values.add("Mehmet");
		values.add("celal");
		System.out.println(values);
	}

}
