package week10thursday;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MpEntryInterface {

	public static void main(String[] args) {
			Map<Integer, String> names = new LinkedHashMap<Integer, String>();
			names.put(4298, "ahmet");
			names.put(4299, "furkan");
			names.put(4300, "oktay");
			names.put(4301, "fatih");
			
			Set set = names.entrySet();
			Iterator iterator = set.iterator();
			
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry)iterator.next();
				System.out.println(entry.getKey()+" "+entry.getValue());
			System.out.println("***************");
				
			for (Map.Entry map : names.entrySet()) {
				System.out.println(map.getKey()+" "+map.getValue());
			}
				
			}

	}

}
