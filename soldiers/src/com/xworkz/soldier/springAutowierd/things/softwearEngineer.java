package com.xworkz.springAutowierd.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class softwearEngineer {
	@Autowired
	@Qualifier("engName")
	private String name;
	@Autowired
	@Qualifier("salary")
	private double salary;
	@Autowired
	@Qualifier("companyName")
	private String companyName;
	@Autowired
	@Qualifier("exp")
	private int exp;
	
	public softwearEngineer() {
		System.out.println("registering softwear");
	}

	@Override
	public String toString() {
		return "softwearEngineer [name=" + name + ", salary=" + salary + ", companyName=" + companyName + ", exp=" + exp
				+ "]";
	}
	
	

}
