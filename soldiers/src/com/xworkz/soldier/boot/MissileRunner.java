package com.xworkz.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldier.configuration.SpringConfiguration;
import com.xworkz.soldier.dto.MissileDto;
import com.xworkz.soldier.servies.MissileServiceImpl;

public class MissileRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext container = 
		new AnnotationConfigApplicationContext(SpringConfiguration.class);
		MissileServiceImpl service = container.getBean(MissileServiceImpl.class);
		boolean dto = service.validationAndSave(new MissileDto());
		System.out.println(dto);
		
	}

}
