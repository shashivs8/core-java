package com.xworkx.collectionApp;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class MetroCityNames {
	
	public static void main(String[] args) {
		String metroCity1="Banglore";
		String metroCity2="Delhi";
		String metroCity3="Mumbai";
		String metroCity4="Kolkata";
		String metroCity5="Chennai";
		
		Collection<String> metro=new TreeSet<String>();
		metro.add(metroCity5);
		metro.add(metroCity4);
		metro.add(metroCity3);
		metro.add(metroCity2);
		metro.add(metroCity1);
		
		for(String elements: metro) {
			System.out.println(elements);
		}
		System.out.println("===After Iterator===");
		
		Iterator<String> cities=metro.iterator();
		 while(cities.hasNext()) {
			 System.out.println(cities.next());
		 }

		
	}

}
