package com.xworkx.collectionApp;

import java.io.Serializable;

public class ApplicationDTO implements Serializable{
	
	String name;
	double virsion;
	boolean isFree;
	String developedBy;
	
	public ApplicationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApplicationDTO(String name, double virsion, boolean isFree, String developedBy) {
		super();
		this.name = name;
		this.virsion = virsion;
		this.developedBy=developedBy;
		this.isFree = isFree;
	}

	
	
	
	public String getName() {
		return name;
	}
	public double getVirsion() {
		return virsion;
	}
	public boolean isFree() {
		return isFree;
	}
	public String getDevelopedBy() {
		return developedBy;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setVirsion(double virsion) {
		this.virsion = virsion;
	}
	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}
	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}
	
	
	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", virsion=" + virsion + ", isFree=" + isFree + ", developedBy="
				+ developedBy + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if (obj instanceof ApplicationDTO) {
				
				ApplicationDTO app= (ApplicationDTO)obj;
				
				if(developedBy.equals(this.developedBy)) {
					return true;
				}
				
			}
			
		}
		return false;
	}
	
	
}
