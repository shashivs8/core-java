package com.xworkz.valentine.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.entity.ValentineEntity;
import com.xworkz.valentine.repository.ValentineRepository;
@Service
public class ValentineServiceImpl implements ValentineService {

	@Autowired
	private ValentineRepository valentineRepository;
	public ValentineServiceImpl() {
		System.out.println("craeted " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto) {
		System.out.println("running validate and save");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDTO>> constraintViolations = validator.validate(dto);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("Violations in dto" + dto);
			return constraintViolations;
		} else {
			System.out.println("constaintViolations does not exist in dto, can save");
			ValentineEntity entity = new ValentineEntity();
			entity.setName(dto.getName());
			entity.setValentineName(dto.getValentineName());
			entity.setPlaces(dto.getPlaces());
			entity.setGifts(dto.getGifts());
			
			boolean saved=this.valentineRepository.save(entity);
			System.out.println("Entity Data is Saved "+saved);
			return Collections.emptySet();
		}

	}

}
