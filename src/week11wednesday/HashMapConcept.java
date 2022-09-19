package week11wednesday;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new LinkedHashMap<Integer, String>();
		
		hashMap.put(06, "Ankara");
		hashMap.put(61, "Trabzon");
		hashMap.put(34, "Istanbul");
		hashMap.put(41, "Kocaeli");
		hashMap.put(07, "Ankara");
		
		
		for (Map.Entry hashMapValue : hashMap.entrySet()) {
			System.out.println(hashMapValue.getKey() + " " + hashMapValue.getValue());
			
		}


	}

}
