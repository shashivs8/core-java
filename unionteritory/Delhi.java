package com.xworks.inheritanceapp.unionteritory;

public class Delhi extends UnionTeritory {
	
	public static void main(String[] args) {
		
		UnionTeritory dl = new UnionTeritory();
		dl.unionTeritory(5000);
		dl.unionTeritoryName="delhi";
		dl.pincode= 110001;
		dl.capital="delhi";
		dl.getInfro();
		System.out.println("Population in delhi " + dl.population);
		System.out.println("pincode of delhi " + dl.pincode);
		

		
	}

}
