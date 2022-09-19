package week10thursday;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {
// Collection classes only stores values
// Map Classes stores keys-values
// Map doesn’t allow duplicate key, but it can have duplicate value
// TreeMap is sorting keys in alphabetic order
		Map<String, String> map = new TreeMap<>();
		
		map.put("robert@siliconelab.com", "123456");
		map.put("ahmet@siliconelabs.com", "123456");
		map.put("ahmet@siliconelabs.com", "123456");
		System.out.println(map);
		
// LinkedHashMap is storing the keys in insertion order
		LinkedHashMap<Double, Integer > map2 = new LinkedHashMap<>();
		
		map2.put(1.7, 1);
		map2.put(9.8, 9);
		map2.put(9.3, 9);
		System.out.println(map2);
		
// HashMap doesn’t maintain insertion order
		Map<String, String> map3 = new HashMap<>();
		
		map3.put("robert@siliconelab.com", "123456");	
		map3.put("bob@siliconelabs.com", "123456");
		map3.put("john@siliconelabs.com", "123456");
		map.put("ahmet@siliconelabs.com", "123456");
		map.put("ahmet@siliconelabs.com", "123456");
		
		// Remove object
		map3.remove("robert@siliconelab.com", "123456");
		System.out.println(map3);
		
		// putAll
		Map<String, String> map4 = new HashMap<>();
		map4.putAll(map3);
		System.out.println(map4);
		
		// containsKey - containsValue
		
		
	}

}
