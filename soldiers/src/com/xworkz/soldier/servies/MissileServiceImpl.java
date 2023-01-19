package com.xworkz.soldier.servies;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MissileDto;
import com.xworkz.soldier.repo.MissileRepoImpl;

@Component
public class MissileServiceImpl implements MissileService {
	
	private Validator validator;
	@Autowired
	private MissileRepoImpl missileRepo;
	
	public MissileServiceImpl() {
		System.out.println("Creating " + this.getClass().getSimpleName());
	}
	
	@Autowired
	public void setValidator(Validator validator) {
		this.validator = validator;
	}

	@Override
	public boolean validationAndSave(MissileDto missileDto) {

		System.out.println("Running Validation And Save ");

		System.out.println("Missile Dto " + missileDto);
		
	Set<ConstraintViolation<MissileDto>> violation =
			validator.validate(missileDto);
	
		if (!violation.isEmpty()) {
			System.err.println("Error in violation ");
			violation.forEach(v->System.out.println(v.getMessage()));
			
			return true;
		} else {
			System.out.println("No Error in violation");
			boolean saved= missileRepo.save(missileDto);
			return false;
		}
		
		
	}

}
