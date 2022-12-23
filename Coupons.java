package com.xworkx.collectionApp;

import java.util.Collection;
import java.util.LinkedList;

public class Coupons {
	
	public static void main(String[] args) {
		
		Collection collection = new LinkedList();
		collection.add("SH2022KLS");
		collection.add("MH2020HJK");
		collection.add("AB2018LNM");
		collection.add("CB2022DGF");
		collection.add("GH4561GHD");
		collection.add("BG2022LKJ");
		collection.add("GY2021JKK");
		collection.add("LK2022FGF");
		collection.add("JK2022HGJ");
		collection.add("SH2019JUK");
		collection.add("DE1666LKM");
		collection.add("ER2015HJK");
		collection.add("GH2018DDD");
		
		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());

	}

}
