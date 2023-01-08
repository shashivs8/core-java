package com.xworkx.collectionApp.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Chocalates {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("dairyMilk", 100);
		map.put("Eclairs", 1);
		map.put("KitKat", 10);
		map.put("MilkyBar", 20);
		map.put("Snikkers", 100);
		map.put("Appenlibe", 1);
		map.put("Candyman", 1);
		map.put("5 STAR", 20);
		map.put("KachaMango", 1);
		map.put("Melody", 1);
	
		
		
		Collection<String> keys= map.keySet();
		//for only keys
		System.out.println(keys);
		
		Collection<Integer> values=map.values();
		values.forEach(a->System.out.println(a));
		
		Set<Entry<String, Integer>> entries = map.entrySet();
		
		System.out.println(entries);
	}

}
