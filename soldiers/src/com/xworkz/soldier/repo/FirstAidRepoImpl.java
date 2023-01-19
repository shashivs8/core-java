package com.xworkz.soldier.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.FirstAidDTO;

@Component
public class FirstAidRepoImpl implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDTO firstAidDto) {
		System.out.println("Running Save");
		return true ;
	}

}
