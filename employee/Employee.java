package com.school.app;

public class Employee {
	
	public String employeeID;
	public String name;
	public static String company;
	

	public String bloodGroup;
	
	
	public Employee() {
		
		
	}
	
	public  Employee(String empID,String nm, String bg) {
		
		this.employeeID=empID;
		this.name=nm;
		this.bloodGroup=bg;
		
	}
	
	public static void toGetOrgGrow() {
		
		System.out.println("Dabbaki");
		
	}

}
