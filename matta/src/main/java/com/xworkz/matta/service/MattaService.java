package com.xworkz.matta.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.matta.dto.MattaDTO;

public interface MattaService {
	
	Set<ConstraintViolation<MattaDTO>> validateAndSave(MattaDTO dto);
	
	default MattaDTO findbyId(int id) {
	
		return null;
	}

}
