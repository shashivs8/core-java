package com.xworkz.springs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springs.boot.Acters;
import com.xworkz.springs.boot.Rocket;
import com.xworkz.springs.boot.Season;

@Configuration
@ComponentScan("com.xworkz.springs")
public class SpringConfiguration {

	@Bean
	public Rocket getRocket() {

		Rocket rocket = new Rocket();
		return rocket;
	}

	@Bean
	public Acters act() {

		Acters ac = new Acters("Yash", "Kannada", 40);

		return ac;
	}

	@Bean
	public Season getSeason() {

		Season sc = new Season();
		sc.setName("Summer");
		sc.setStartingMonth("March");
		sc.setDurationInMonth(5);

		return sc;
	}

}
