package com.xworkx.collectionApp;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ShoesSizes {
	public static void main(String[] args) {
		
		int size1=5;
		int size2=6;
		int size3=7;
		int size4=8;
		int size5=9;
		int size6=10;
		int size7=11;
		int size8=12;
		int size9=13;
		int size10=14;
		int size11=15;
		int size12=16;
		int size13=17;
		int size14=18;
		int size15=19;
		
		Collection<Integer> shoes = new HashSet<Integer>();
		shoes.add(size1);
		shoes.add(size2);
		shoes.add(size3);
		shoes.add(size4);
		shoes.add(size5);
		shoes.add(size6);
		shoes.add(size7);
		shoes.add(size8);
		shoes.add(size9);
		shoes.add(size10);
		shoes.add(size11);
		shoes.add(size12);
		shoes.add(size13);
		shoes.add(size14);
		shoes.add(size15);

		for(Integer size:shoes) {
			System.out.println(size);
		}
		System.out.println("=====after Interator====");
		
		Iterator<Integer> shoes1= shoes.iterator();
		while(shoes1.hasNext()) {
			System.out.println(shoes1.next());
		}
	}

}
