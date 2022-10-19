package com.school.app;

public class FootWear {

	public String company;
	public String colour;
	public  int size;
	public int price;
	

	
	
	public FootWear() {
		
		
	}
	
	public  FootWear(String comp,String col, int sz, int rs) {
		
		this.company=comp;
		this.colour=col;
		this.price=rs;
		this.size=sz;
		
	}
	
	public static void toGetFootWear() {
		
		System.out.println("Kera");
		
	}
}
