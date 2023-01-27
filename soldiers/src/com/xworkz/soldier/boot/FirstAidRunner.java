package com.xworkz.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldier.configuration.SpringConfiguration;
import com.xworkz.soldier.dto.FirstAidDTO;
import com.xworkz.soldier.servies.FirstAidService;

public class FirstAidRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext container = 
				new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
	FirstAidService dto=container.getBean(FirstAidService.class);
	boolean saved= dto.validateAndSave(new FirstAidDTO());
	System.out.println(saved);
		
	}

}
