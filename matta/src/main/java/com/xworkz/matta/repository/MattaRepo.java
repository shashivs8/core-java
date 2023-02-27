package com.xworkz.matta.repository;

import com.xworkz.matta.entity.MattaEntity;

public interface MattaRepo {
	
	boolean save(MattaEntity mattaEntity);
	
	default MattaEntity  findbyId(int id) {
		
		return null;
	}

}
