package com.xworkx.collectionApp;

import java.util.Collection;
import java.util.HashSet;

public class Bikes {

	public static void main(String[] args) {
		
		Collection collection = new HashSet();
		collection.add("CD-100");
		collection.add("Splender");
		collection.add("XL");
		collection.add("Duke");
		collection.add("Splender +");
		collection.add("Royal enfild");
		collection.add("R15");
		collection.add("Samurai");
		collection.add("MT-15");
		collection.add("Dream Yuga");
		collection.add("Shine");
		collection.add("Unicorn");
		collection.add("Super Splender");
		collection.add("Harly Devid Son");
		collection.add("Pasion Pro");
		collection.add("Himalayan");
		collection.add("X-pulse");
		collection.add("Kawasaki");
		
		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());

	}
}
