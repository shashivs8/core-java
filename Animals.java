package com.xworkx.collectionApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class Animals {

	public static void main(String[] args) {
		
		String animal1="Dog";
		String animal2="Elephant";
		String animal3="Monkey";
		String animal4="Cat";
		String animal5="Donkey";
		String animal6="Cow";
		String animal7="Horse";
		String animal8="Deer";
		String animal9="Giraffee";
		String animal10="Zebra";
		
		Collection<String> animals =  new ArrayList<String>();
			animals.add(animal10);
			animals.add(animal9);
			animals.add(animal8);
			animals.add(animal7);			
			animals.add(animal6);
			animals.add(animal5);
			animals.add(animal4);
			animals.add(animal3);
			animals.add(animal2);
			animals.add(animal1);
			
			for(String element : animals) {
				System.out.println(element);
			}
			
			System.out.println("====after Iterator====");
			Iterator<String> element2 = animals.iterator();
			while(element2.hasNext()) {
				String animals2=element2.next();
				System.out.println(animals2);
			}
	}

}
