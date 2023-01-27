package com.xworkz.soldier.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.soldier")
public class SpringConfiguration {
	
	@Bean
	public Validator validator() {
		
	ValidatorFactory validation =	Validation.buildDefaultValidatorFactory();
	Validator validator= validation.getValidator();
	
		return validator;
	}
	
}
