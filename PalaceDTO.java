package com.xworkx.collectionApp;

import java.io.Serializable;
import java.util.Comparator;

public class PalaceDTO implements Serializable, Comparable<PalaceDTO> {
	
	String name;
	String builtBy;
	boolean isDestroyed;
	Double visitingFees;
	
	
	public PalaceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PalaceDTO(String name, String builtBy, boolean isDestroyed, Double visitingFees) {
		super();
		this.name = name;
		this.builtBy = builtBy;
		this.isDestroyed = isDestroyed;
		this.visitingFees = visitingFees;
	}


	public String getName() {
		return name;
	}


	public String getBuiltBy() {
		return builtBy;
	}


	public boolean isDestroyed() {
		return isDestroyed;
	}


	public Double getVisitingFees() {
		return visitingFees;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}


	public void setDestroyed(boolean isDestroyed) {
		this.isDestroyed = isDestroyed;
	}


	public void setVisitingFees(Double visitingFees) {
		this.visitingFees = visitingFees;
	}


	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", builtBy=" + builtBy + ", isDestroyed=" + isDestroyed + ", visitingFees="
				+ visitingFees + "]";
	}
	
	@Override
	public int compareTo(PalaceDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj!=null) {
			
			if((obj instanceof PalaceDTO ) ) {
				PalaceDTO dto = (PalaceDTO)obj ;
				if (name.equals(this.name)) {
					return true;
				}
			}
			
		}
		
		
		return false;
		
	}
	
	
	
	

}
