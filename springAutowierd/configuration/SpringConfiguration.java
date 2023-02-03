package com.xworkz.springAutowierd.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springAutowierd")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Registering Spring configuration");

	}

	@Bean
	public int id() {

		System.out.println("Registering id");
		return 10;
	}

	@Bean
	public int gstNo() {

		System.out.println("Registering gstNo");
		return 123456;
	}

	@Bean
	public String HarwareShopName() {
		System.out.println("Registering Hardware shop Name");
		String ref = new String("MahaLakshmi");
		return ref;

	}

	@Bean
	public String ownerName() {
		System.out.println("Registering Owner Name");
		String ref = new String("Sandesh");
		return ref;
	}

	@Bean
	public String name() {

		return "java";
	}

	@Bean
	public double version() {

		return 1.8;
	}

	@Bean
	public boolean isFree() {

		return true;
	}

	@Bean
	public String date() {

		return "12/12/2022";
	}

	@Bean
	public String developer() {

		return "shashi";
	}
	@Bean
	public String engName() {

		return "Shashi";
	}

	@Bean
	public double salary() {

		return 8.8;
	}
	
	@Bean
	public int exp() {
		return 5;
	}
	@Bean
	public String companyName() {

		return "Infosys";
	}
	
	@Bean
	public String pencilName() {

		return "Apsara";
	}
	
	@Bean
	public double pencilPreice() {

		return 3.0;
	}
	@Bean
	public String type() {

		return "bariyodu";
	}
	@Bean
	public String colourofPencil() {

		return "black";
	}
	@Bean
	public boolean isStolen() {

		return false;
	}
	@Bean
	public String shape() {

		return "udda";
	}
	
	@Bean
	public String rubberName() {

		return "Apsara";
	}
	
	@Bean
	public double rubberPreice() {

		return 3.0;
	}
	@Bean
	public String rubbertype() {

		return "adsodu";
	}
	@Bean
	public String colourofRubber() {

		return "white";
	}
	@Bean
	public boolean isRubberStolen() {

		return true;
	}
	@Bean
	public String rubbershape() {

		return "rectangle";
	}
	
	@Bean
	public String myName() {

		return "Shashi";
	}
	@Bean
	public int myAge() {

		return 23;
	}
	@Bean
	public boolean isHappy() {

		return true;
	}
	@Bean
	public char initial() {

		return 'S';
	}
	@Bean
	public double mySalary() {
		return 8.5d;
	}
	@Bean
	public float myPercentage() {

		return 79.63f;
	}
	@Bean
	public long myPhno() {

		return 7338334018l;
	}
	
	
}
