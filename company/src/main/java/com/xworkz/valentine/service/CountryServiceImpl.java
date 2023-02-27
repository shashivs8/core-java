package com.xworkz.valentine.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.valentine.dto.CountryDTO;
import com.xworkz.valentine.entity.CountryEntity;
import com.xworkz.valentine.repository.CountryRepo;

public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepo countryRepo;

	@Override
	public Set<ConstraintViolation<CountryDTO>> validateAndSave(CountryDTO dto) {
	
		System.out.println("Runnnning >>> validateAndSave.....");
		
		ValidatorFactory validatorFactory=Validation.buildDefaultValidatorFactory();
		
		Validator validator=validatorFactory.getValidator();
		
		Set<ConstraintViolation<CountryDTO>> constraintViolations=validator.validate(dto);
		
		if(constraintViolations!=null && !constraintViolations.isEmpty()) {
			
			System.err.println("vaiolation Existes ,return violation"+dto);
			
			return constraintViolations;
		}
		else {
			System.out.println("violation does not existes ,data is success...");
			
			CountryEntity airoplaneEntityDto=new CountryEntity();
			airoplaneEntityDto.setCompany(dto.getCompany());
			airoplaneEntityDto.setCost(dto.getCost());
			airoplaneEntityDto.setCountry(dto.getCountry());
			airoplaneEntityDto.setName(dto.getName());
			airoplaneEntityDto.setType(dto.getType());
			
			boolean saved=countryRepo.save(airoplaneEntityDto);
			
			System.out.println("created :"+saved);
			
			return Collections.emptySet();
		
		}
	
	}
	
	@Override
    public CountryDTO findBy(int id) {
	
	if(id>0) {
		CountryEntity airoplaneEntityDto=this.countryRepo.findById(id);
		if(airoplaneEntityDto!=null) {
			System.out.println("entity is found in service for id"+id);
			
			CountryDTO airoplaneDto=new CountryDTO();
			
			airoplaneDto.setCompany(airoplaneEntityDto.getCompany());
			airoplaneDto.setCost(airoplaneEntityDto.getCost());
			airoplaneDto.setCountry(airoplaneEntityDto.getCountry());
			airoplaneDto.setName(airoplaneEntityDto.getName());
			airoplaneDto.setType(airoplaneEntityDto.getType());
			return airoplaneDto;
		}
	}
	
	return CountryService.super.findBy(id);
}
}
