package com.xworkx.collectionApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sweets {
	public static void main(String[] args) {
		
		TreeSet collections = new TreeSet();
		
		collections.add("Gulab Jamun");
		collections.add("Jilebi");
		collections.add("Mysore Pak");
		collections.add("ladu");
		collections.add("Kajaya");
		collections.add("Barfi");
		collections.add("Rasgulla");
		collections.add("Sandesh");
		collections.add("KattaMitta");
		collections.add("Sugar");
		collections.add("RasMalai");
		collections.add("careet alwa");
		collections.add("kulfi");


		
		System.out.println(collections.size());
		collections.clear();
		System.out.println("After clear method");
		System.out.println(collections.size());


	}
}
