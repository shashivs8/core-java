package com.xworkz.springAutowierd.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mytype {
	@Autowired
	@Qualifier("myName")
	 private String name;
	@Autowired
	@Qualifier("myAge")
	 private int age;
	@Autowired
	@Qualifier("myPhno")
	 private long phNo;
	@Autowired
	@Qualifier("initial")
	 private char initial ;
	@Autowired
	@Qualifier("mySalary")
	 private double salary;
	@Autowired
	@Qualifier("isHappy")
	 private boolean isHappy;
	@Autowired
	@Qualifier("myPercentage")
	 private float percentage;
	 
	 
	 public Mytype() {
		System.out.println("Registerning myType");
	}


	@Override
	public String toString() {
		return "Mytype [name=" + name + ", age=" + age + ", phNo=" + phNo + ", initial=" + initial + ", salary="
				+ salary + ", isHappy=" + isHappy + ", percentage=" + percentage + "]";
	}
	 
	 
	 
	 

}
