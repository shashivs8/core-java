package com.xworkz.soldier.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MissileDto;

@Component
public class MissileRepoImpl implements MissileRepo {

	@Override
	public boolean save(MissileDto Dto) {
		System.out.println("Running Save ");
		
		return false;
	}

}
