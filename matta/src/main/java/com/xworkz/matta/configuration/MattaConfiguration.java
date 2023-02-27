package com.xworkz.matta.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan("com.xworkz.matta")

public class MattaConfiguration {

	public MattaConfiguration() {
		System.out.println("Running " + this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Running viewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}
	
	@Bean
	public LocalEntityManagerFactoryBean localEntityManagerFactoryBean() {
		System.out.println("creating localEntityManagerFactoryBean");
		return new LocalEntityManagerFactoryBean();
	}
}
