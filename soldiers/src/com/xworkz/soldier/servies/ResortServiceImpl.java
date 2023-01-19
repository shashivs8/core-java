package com.xworkz.soldier.servies;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.ResortDTO;
import com.xworkz.soldier.repo.ResortRepo;

@Component
public class ResortServiceImpl implements ResortService {
	
	private ResortRepo repo;
	@Autowired
	private Validator validator;
	
	@Autowired
	public void setRepo(ResortRepo repo) {
		this.repo=repo;
	}
	
	@Override
	public boolean validationAndSave(ResortDTO resortDto) {
		System.out.println("Running ValidationAndSave");
		
	Set<ConstraintViolation<ResortDTO>> violation = validator.validate(resortDto);
		if(!violation.isEmpty()) {
			System.err.println("Violation Error ");
			violation.forEach(v->System.out.println(v.getMessage()));
			return true;
		}else {
			System.out.println("No error ");
			boolean saved = repo.save(repo);
			return false;
		}
		
	}
	
	
	
	

}
