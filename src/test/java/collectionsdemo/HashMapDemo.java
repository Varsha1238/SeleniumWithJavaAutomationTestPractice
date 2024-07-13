package collectionsdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("one", 1);
		mp.put("Two", 2);
		mp.put("Three", 3);
		mp.put("Four", 4);
		for (Map.Entry<String, Integer> e : mp.entrySet()) {

			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());

		}
	
		for (String key : mp.keySet()) {

			System.out.println(key);

		}

		for (Integer value : mp.values()) {

			System.out.println(value);

		}

	}

}
