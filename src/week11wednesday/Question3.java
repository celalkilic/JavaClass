package week11wednesday;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Question3 {

	public static void main(String[] args) {
		String str = "aabbbbcd"; // a2b4c1d1
		String str2 = "aaabbbbbccdaac"; //a3b5c2d1
		
		char[] original = str2.toCharArray();
		
		Map<Character, Integer> strMap = new HashMap<Character, Integer>();
		
		for (char ch : original) {
			if (strMap.containsKey(ch)) {
				strMap.put(ch, strMap.get(ch)+ 1);
			}else {
				strMap.put(ch, 1);
			}
		}
		
		String newStr = "";
		for (Entry<Character, Integer> entry : strMap.entrySet()) {
			newStr += entry.getKey() + "" +entry.getValue();
		}
		
		System.out.println(newStr);

	}

}
