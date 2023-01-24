package com.xworkz.springs.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	@Value("India")
	private String country;
	@Value("Chandrayan")
	private String name;
	@Value("250000000d")
	private double budget;

	public Rocket() {
		System.out.println("Register Rocket Objects");
	}
	
	@Bean
	public String getCountry() {
		return country;
	}
	@Bean
	public String getName() {
		return name;
	}
	@Bean
	public double getBudget() {
		return budget;
	}

}
