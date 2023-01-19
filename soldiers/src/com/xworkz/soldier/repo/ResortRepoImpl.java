package com.xworkz.soldier.repo;

import org.springframework.stereotype.Component;

@Component
public class ResortRepoImpl implements ResortRepo {

	@Override
	public boolean save(ResortRepo repo) {
		System.out.println("Running Save ");
		
		return false;
	}
	
	
	
}
