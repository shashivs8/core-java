package com.xworkz.springAutowierd.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	@Autowired
	@Qualifier("rubberName")
	 private String name;
	@Autowired
	@Qualifier("rubbertype")
	 private String type;
	@Autowired
	@Qualifier("rubberPreice")
	 private double price;
	@Autowired
	@Qualifier("colourofRubber")
	 private String colour;
	@Autowired
	@Qualifier("rubbershape")
	 private String shape;
	@Autowired
	@Qualifier("isRubberStolen")
	 private boolean isStolen;
	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", colour=" + colour + ", shape="
				+ shape + ", isStolen=" + isStolen + "]";
	}
	
	

}
