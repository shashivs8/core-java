package com.school.app;

public class EmployeeTester {

	public static void main(String args[]) {
		Employee.company="Amazon";
		
		Employee emp= new Employee("AWS123" ,"Sandesh", "A+/-");
		
		System.out.println(emp.employeeID +" "+ emp.name + "  " + emp.bloodGroup+ " " + Employee.company);
		
		
		Employee emp1= new Employee("AWS08","Shashi","A+");
		
		System.out.println(emp1.employeeID +" "+ emp1.name + "  " + emp1.bloodGroup+ " " + Employee.company);

		Employee.toGetOrgGrow();

	}
	
}
