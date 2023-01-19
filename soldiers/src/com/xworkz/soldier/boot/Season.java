package com.xworkz.springs.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Season {
	
	private String name;
	private int durationInMonth;
	private String startingMonth;
	
	@Bean
	public String getName() {
		return name;
	}
	@Bean
	public int getDurationInMonth() {
		return durationInMonth;
	}
	@Bean
	public String getStartingMonth() {
		return startingMonth;
	}
	@Value("Winter")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("4")
	public void setDurationInMonth(int durationInMonth) {
		this.durationInMonth = durationInMonth;
	}
	
	@Value("July")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}
	
	

}
