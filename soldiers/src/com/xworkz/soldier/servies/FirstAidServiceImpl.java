package com.xworkz.soldier.servies;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.FirstAidDTO;
import com.xworkz.soldier.repo.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstAidService {
	
	@Autowired
	private Validator validator;
	private FirstAidRepo firstaidRepo;
	
	public FirstAidServiceImpl(FirstAidRepo firstaidDto) {
		this.firstaidRepo=firstaidDto;
		
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Autowired
	public void setFirstaidDto(FirstAidRepo firstaidRepo) {
		this.firstaidRepo = firstaidRepo;
	}
	
	
	
	
	@Override
	public boolean validateAndSave(FirstAidDTO aidDto) {
		System.out.println("running validat and save ");
		System.out.println("firstAidDto " + aidDto);
		
	
	Set<ConstraintViolation<FirstAidDTO>> voilation= validator.validate(aidDto);
	voilation.forEach(v->System.out.println(v.getMessage())); 
	if (!voilation.isEmpty()) {
		System.err.println("Error violation");
		voilation.forEach(v->System.out.println(v.getMessage())); 
		
		return false;
	}else {
		System.out.println("No error");
		boolean save=firstaidRepo.save(aidDto);
		return true;
	}
	 
		
	}

}
