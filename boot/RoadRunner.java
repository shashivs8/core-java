package com.xworkz.springs.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springs.config.SpringConfiguration;
import com.xworkz.springs.thing.Road;

public class RoadRunner {
	
	public static void main(String[] args) {
		
	
		ApplicationContext spring = 
				new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Road ref = spring.getBean(Road.class);
		System.out.println(ref);
	}

}
