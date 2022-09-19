package week12monday;

import java.awt.List;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapConcept {

	public static void main(String[] args) {
		
		//Keys will not be in the inserted order
		
		Map<Integer, String> employees = new HashMap<Integer, String>();
		
		// keys remain in inserted order
		
		employees = new LinkedHashMap<Integer, String>();
		
		// keys are sorted in a nature order
		
		employees = new TreeMap<Integer, String>();
		employees.put(01, "celal");
		employees.put(02, "zeynep");
		employees.put(03, "kemal");
		employees.put(04, "zehra");
		System.out.println("employees : "+employees);
		
		for (Integer key : employees.keySet()) {
			System.out.println(key+" : "+employees.get(key));
		}
		System.out.println("****************");
		for (Map.Entry<Integer, String> employeeEntry : employees.entrySet()) {
			System.out.println(employeeEntry.getKey()+ " : "+ employeeEntry.getValue());
		}
	}

}
