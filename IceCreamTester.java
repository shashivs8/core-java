package com.school.app;

public class IceCreamTester {
	
	public static void main(String args[]) {
		
		
		IceCream ice= new IceCream("Cone" ,"Choclate", 5);
		
		System.out.println(ice.name +" "+ ice.flavoer + "  " + ice.price);
		
		
		
		IceCream.toGetIceCream();

	}

}
