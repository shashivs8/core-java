package com.xworkz.beach.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.beach")
public class BeachConfiguration {
	
	public BeachConfiguration() {
		System.out.println("Running " + this.getClass().getSimpleName());
	}



}
