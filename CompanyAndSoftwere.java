package com.xworkx.collectionApp.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CompanyAndSoftwere {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("Capgemini", "Java");
		map.put("Wipro", ".Net");
		map.put("Infosys", "Java");
		map.put("TechMehindra", "Python");
		map.put("Apple", "SAP");
		map.put("Orlac", "Java");
		map.put("Axis", "Java");
		map.put("Flipkart", "Java");
		map.put("Amazon", "C+");
		map.put("Hp", "c+");

		System.out.println("=========Keys========");
		Collection<String> keys = map.keySet();
		// for only keys
		for (String string : keys) {

			System.out.println(string);
		}

		System.out.println("  ");
		System.out.println("=====values======");
		Collection<String> values = map.values();
		values.forEach(a -> System.out.println(a));

		System.out.println("  ");
		System.out.println("=====key and values======");

		Set<Entry<String, String>> entries = map.entrySet();
		entries.forEach(a -> System.out.println(a));

	}

}
