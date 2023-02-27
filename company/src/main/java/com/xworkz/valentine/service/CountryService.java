package com.xworkz.valentine.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.valentine.dto.CountryDTO;

public interface CountryService {

	Set<ConstraintViolation<CountryDTO>> validateAndSave(CountryDTO dto);

	default CountryDTO findBy(int id) {

		return null;
	}
}
