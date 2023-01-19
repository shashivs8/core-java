package com.xworkz.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldier.configuration.SpringConfiguration;
import com.xworkz.soldier.dto.ResortDTO;
import com.xworkz.soldier.servies.ResortServiceImpl;

public class ResortRunner {

	public static void main(String[] args) {
		
		ApplicationContext container = new 
				AnnotationConfigApplicationContext(SpringConfiguration.class);
		ResortServiceImpl service = container.getBean(ResortServiceImpl.class);
		boolean saved= service.validationAndSave(new ResortDTO());
		System.out.println(saved);
	}

}
