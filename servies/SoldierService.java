package com.xworkz.soldier.servies;

import com.xworkz.soldier.dto.SoldierDTO;

public interface SoldierService {
	
	public  abstract boolean validateAndSave(SoldierDTO dto);

}
