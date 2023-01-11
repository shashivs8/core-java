package com.xworkz.springAutowierd.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	
	@Autowired
	@Qualifier("id")
	private int id;
	@Autowired
	@Qualifier("HarwareShopName")
	private String name;
	@Autowired
	@Qualifier("gstNo")
	private int gstNo;
	@Autowired
	@Qualifier("ownerName")
	private String ownerName;

	public HardwareShop() {
		System.out.println("Registering Hardware");
	}

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName + "]";
	}
	
	

		
}
