package com.xworkz.springAutowierd.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Softwear {

	@Autowired
	@Qualifier("name")
	private String name;

	@Autowired
	@Qualifier("version")
	private double version;

	@Autowired
	@Qualifier("developer")
	private String developer;

	@Autowired
	@Qualifier("date")
	private String date;
	
	@Autowired
	@Qualifier("isFree")
	private boolean isFree;

	public Softwear() {
		System.out.println("Registering Softwear");
	}

	@Override
	public String toString() {
		return "Softwear [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date
				+ ", isFree=" + isFree + "]";
	}

		
}
