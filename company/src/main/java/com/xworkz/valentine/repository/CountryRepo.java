package com.xworkz.valentine.repository;

import com.xworkz.valentine.dto.CountryDTO;
import com.xworkz.valentine.entity.CountryEntity;

public interface CountryRepo {
	
	boolean save(CountryEntity countryEntity);
	
	default CountryEntity findById(int id) {
		return null;
	}

}
