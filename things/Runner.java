package com.xworkz.springs.things;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springs.boot.Acters;
import com.xworkz.springs.boot.Rocket;
import com.xworkz.springs.boot.Season;
import com.xworkz.springs.config.SpringConfiguration;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext container = 
		new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		System.out.println("  ");
		
		Rocket refOfRocket = container.getBean("rocket",Rocket.class);
		System.out.println(refOfRocket);
		System.out.println(refOfRocket.getCountry());
		System.out.println(refOfRocket.getName());
		System.out.println(refOfRocket.getBudget());
		
		Rocket refOfRocket2= container.getBean("getRocket",Rocket.class);
		System.out.println(refOfRocket2);
		System.out.println(refOfRocket2.getCountry());
		System.out.println(refOfRocket2.getName());
		System.out.println(refOfRocket2.getBudget());
		
		Acters refOfActers= container.getBean("acters",Acters.class);
		System.out.println(refOfActers);
		System.out.println(refOfActers.getName());
		System.out.println(refOfActers.getLanguage());
		System.out.println(refOfActers.getAge());
		
		Acters refOfActers2 = container.getBean("act",Acters.class);
		System.out.println(refOfActers2);
		System.out.println(refOfActers2.getName());
		System.out.println(refOfActers2.getLanguage());
		System.out.println(refOfActers2.getAge());
		
		Season refOfSeason = container.getBean("season",Season.class);
		System.out.println(refOfSeason);
		System.out.println(refOfSeason.getName());
		System.out.println(refOfSeason.getStartingMonth());
		System.out.println(refOfSeason.getDurationInMonth());
		

		Season refOfSeason2 = container.getBean("getSeason",Season.class);
		System.out.println(refOfSeason2);
		System.out.println(refOfSeason2.getName());
		System.out.println(refOfSeason2.getStartingMonth());
		System.out.println(refOfSeason2.getDurationInMonth());
		
		
		
	}

}
