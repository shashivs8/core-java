package com.school.app;

public class WatchTester {
	
	public static void main(String args[]) {
		
Watch wa= new Watch("Noice" ,"Digital",4000);
		
		System.out.println(wa.brand +" "+ wa.type + "  " +wa.price);
		
		Watch wa1= new Watch("Sonato" ,"Analog",7500);
		
		System.out.println(wa1.brand +" "+ wa1.type + "  " +wa1.price);

				
		Watch.ToGetWatch();
		
		
	}

}
