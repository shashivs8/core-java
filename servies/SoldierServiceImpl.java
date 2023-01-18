package com.xworkz.soldier.servies;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.SoldierRepo;

public class SoldierServiceImpl implements SoldierService{

	public SoldierRepo soldierRepo;
	
	public SoldierRepo getSoldierRepo() {
		return soldierRepo;
	}
	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo = soldierRepo;
	}
		
	public SoldierServiceImpl() {
		System.out.println("Creating Soldier ServiceImpl Using no arg const...");
	}
		
	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("Starting ValidationAndSave");
		System.out.println("dto passed :" + dto);
		
		ValidatorFactory factory= Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		
		Set<ConstraintViolation<SoldierDTO>> violations =
				validator.validate(dto);
		if(!violations.isEmpty()) {
			System.err.println("There are validation error");
			
			violations.forEach(v->{
				System.err.println("violating message " + v.getMessage());
			});
			
			return false;
		} else {
			System.out.println("Data is valid");
			boolean saved = soldierRepo.save(dto);
			System.out.println("Dto saved using repon " + saved);
			return saved;
		}
	}

}
