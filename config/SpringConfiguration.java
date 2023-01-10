package com.xworkz.springs.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springs")
public class SpringConfiguration {
	
	@Bean
	public String thindi() {
		
		String s= new String ("Chapati");
		
		return "email";
	}
	@Bean
	public boolean isStarving() {
		boolean isTiffen = true;
		return isTiffen;
	}
	
	public int noOfplates() {
		
		return 2;
	}
	@Bean
	public float Float() {
		float no=1.2f;
		return no;
	}
	
	
	@Bean
	public String uta() {
		
		String s= new String ("Chapati");
		
		return s;
	}
	@Bean
	public boolean isUtaAytha() {
		boolean isTiffen = true;
		return isTiffen;
	}
	
	public int noOfThatte() {
		
		return 2;
	}
	@Bean
	public float Float1() {
		float no=1.2f;
		return no;
	}
	
	
	
	@Bean
	public  ArrayList<Integer> arrayList(){
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		return (ArrayList<Integer>) al;
		
		
	}

}
