package week11monday;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapConcept {

	public static void main(String[] args) {
		
		// Keys will not be in the inserted order
		Map<Integer, String> employees = new HashMap<Integer, String>();
		
		// Keys remain in inserted order
		employees = new LinkedHashMap<Integer, String>();
		
		// Keys are sorted in a natural order
		employees = new TreeMap<Integer, String>();

		employees.put(01, "Tim");
		employees.put(15, "Robert");
		employees.put(70, "Tom");
		employees.put(30, "Michael");
		employees.put(49, "Ahmet");
		
		System.out.println("Employees : " + employees);
		
		for (Integer key : employees.keySet()) {
			System.out.println(key + " : " +employees.get(key));
		}
		
		for (Map.Entry<Integer, String> employeeEntry : employees.entrySet()) {
			System.out.println(employeeEntry.getKey() + " : " + employeeEntry.getValue());
		}
		
	}

}
