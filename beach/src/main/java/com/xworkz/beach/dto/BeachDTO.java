package com.xworkz.beach.dto;

public class BeachDTO {
	
	private String name;
	private String location;
	private boolean clean;
	private boolean games;
	
	 public BeachDTO() {
		System.out.println("Created BeachDTO using no arg Const...");
	}
	 
	 
	 

	@Override
	public String toString() {
		return "BeachDTO [name=" + name + ", location=" + location + ", clean=" + clean + ", games=" + games + "]";
	}




	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public boolean isClean() {
		return clean;
	}

	public boolean isGames() {
		return games;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}

	public void setGames(boolean games) {
		this.games = games;
	}
	 
	 

}
