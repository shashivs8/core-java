package com.xworkx.collectionApp.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class AreaAndPinCode {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Dabaspete", 562111);
		map.put("Nelamanagala", 562123);
		map.put("Nelamangala Rural", 562132);
		map.put("Kurabarahalli", 56300);
		map.put("tumkur", 56245);
		map.put("MAndya", 56000);
		map.put("Mysore", 56010);
		map.put("Chithradurga", 56210);
		map.put("Kolar", 56856);
		map.put("Mangalore", 54654);
		
		System.out.println("=========Keys========");
		Collection<String> keys = map.keySet();
		// for only keys
		for (String string : keys) {
			
			System.out.println(string);

			
		}
		System.out.println("  ");

		System.out.println("=====values======");
		Collection<Integer> values = map.values();
		values.forEach(a -> System.out.println(a));
		
		System.out.println("  ");

		System.out.println("=====key and values======");

		Set<Entry<String, Integer>> entries = map.entrySet();
		entries.forEach(a->System.out.println(a));
		//System.out.println(entries);
	}
}
