package com.xworkz.valentine.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CountryApplication extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public CountryApplication() {
		System.out.println("Running " + this.getClass().getSimpleName());

	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created getRootConfigClasses" );
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Created getServletConfigClasses");
		return new Class[] {CountryConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("created getServletMappings");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("created configureDefaultServletHandling");
		configurer.enable();
	}
	
	
}
