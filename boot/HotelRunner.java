package com.xworkz.springs.boot;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springs.config.SpringConfiguration;
import com.xworkz.springs.thing.Hotel;

public class HotelRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		String [] beansName = spring.getBeanDefinitionNames();
		
		System.out.println(Arrays.toString(beansName));
		
		ArrayList<Integer> refOfString = spring.getBean("arrayList",ArrayList.class);
		System.out.println(refOfString.hashCode());
		
		Hotel hotel = spring.getBean("circle",Hotel.class);
		System.out.println(hotel);
	}

}
