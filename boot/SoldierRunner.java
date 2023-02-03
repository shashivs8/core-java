package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.SoldierRepo;
import com.xworkz.soldier.repo.SoldierRepoImpl;
import com.xworkz.soldier.servies.SoldierServiceImpl;

public class SoldierRunner {
	
	public static void main(String[] args) {
		SoldierDTO dto = new SoldierDTO("Pr", 9, "bot", "leggere");
		
		SoldierServiceImpl service = new SoldierServiceImpl();
		SoldierRepo repo = new SoldierRepoImpl();
		service.setSoldierRepo(repo);
		service.validateAndSave(dto);
	}

}
