package com.xworkz.springs.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Acters {
	
	private String name;
	private String language;
	private int age;
	
	public Acters(@Value("Darshan")String name, @Value("Kannada") String language, @Value("49")int age) {

		this.name = name;
		this.language = language;
		this.age = age;
	}
	@Bean
	public String getName() {
		return name;
	}
	@Bean
	public String getLanguage() {
		return language;
	}
	@Bean
	public int getAge() {
		return age;
	}
	
	
	

}
