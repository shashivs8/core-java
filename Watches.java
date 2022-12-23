package com.xworkx.collectionApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watches {

	public static void main(String[] args) {
		
		
		String watche1 ="Rolex";
		String watche2 ="HMT";
		String watche3 ="Fastrack";
		String watche4 ="Boat";
		String watche5 ="Noise";
		
		Collection<String> collection = new ArrayList<String>();
		collection.add(watche5);
		collection.add(watche4);
		collection.add(watche3);
		collection.add(watche2);
		collection.add(watche1);
		
		for (String element : collection) {			
			System.out.println(element);			
		}
		System.out.println("==== Iterator====");
		
		Iterator<String> watches= collection.iterator();
		while(watches.hasNext()) {
			String element1=watches.next();
			System.out.println(element1);
		}

	}

}
