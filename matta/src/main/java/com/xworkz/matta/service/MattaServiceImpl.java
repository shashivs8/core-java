package com.xworkz.matta.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.matta.dto.MattaDTO;
import com.xworkz.matta.entity.MattaEntity;
import com.xworkz.matta.repository.MattaRepo;
@Service
public class MattaServiceImpl implements MattaService {
	
	@Autowired
	public MattaRepo mattarepo;

	@Override
	public Set<ConstraintViolation<MattaDTO>> validateAndSave(MattaDTO dto) {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<MattaDTO>> constraintViolations = validator.validate(dto);
		
		if(constraintViolations!=null && !constraintViolations.isEmpty() ) {
			
			System.err.println("Violation eists , return " + dto );
			
			return constraintViolations;
			
		}
		else {
			System.out.println("violation does not existes ,data is success...");
			MattaEntity mattaEntity = new MattaEntity();
			
			mattaEntity.setName(dto.getName());
			mattaEntity.setSwamijiName(dto.getSwamijiName());
			mattaEntity.setLocation(dto.getLocation());
			mattaEntity.setFund(dto.getFund());
			
			boolean save =mattarepo.save(mattaEntity);
			System.out.println("Created" + save);
			
			return Collections.emptySet();
		}
		
		
	}
	
	@Override
	public MattaDTO findbyId(int id) {
		if(id>0) {
			MattaEntity mattaEntity = this.mattarepo.findbyId(id);
			if(mattaEntity!=null) {
				System.out.println("Entity is found for id " + id);
				MattaDTO mattaDTO = new MattaDTO();
				mattaDTO.setName(mattaEntity.getName());	
				mattaDTO.setSwamijiName(mattaEntity.getSwamijiName());
				mattaDTO.setLocation(mattaEntity.getLocation());
				mattaDTO.setFund(mattaEntity.getFund());

				return mattaDTO;
			}
		}
		return MattaService.super.findbyId(id);
	}

}
