package com.xworks.inheritanceapp.unionteritory;

public class UnionTeritory {
	
	String unionTeritoryName;
	int pincode;
   String capital;
	long population=564564;
	
	
	public void unionTeritory(long population) {
		
		System.out.println("Welcome to unionTeriroty");
		this.population= this.population + population;
		
			
	}
	public void getInfro() {
		
		System.out.println("the name of the unionteritory is " + unionTeritoryName);
	}

}
