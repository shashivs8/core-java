package com.xworkx.collectionApp.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PgNamesAndFees {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Gajanana", 4500);
		map.put("Ganesha", 3500);
		map.put("Badra", 5000);
		map.put("Mangala", 4600);
		map.put("Narayana", 5600);
		map.put("Hanumantha", 6000);
		map.put("Jayamma", 7000);
		map.put("5 STAR", 10000);
		map.put("Holle PG", 7000);
		map.put("Kavitha", 5000);

		Collection<String> keys = map.keySet();
		// for only keys
		System.out.println(keys);

		Collection<Integer> values = map.values();
		values.forEach(a -> System.out.println(a));

		Set<Entry<String, Integer>> entries = map.entrySet();

		System.out.println(entries);
	}

}
