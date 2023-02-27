package com.xworkz.valentine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class CountryDTO {

	
	private int id;
	
	@Size(min=3, max=20,message="name cannot be less than 3 or greater than 20 char")
	private String name;
	
	@Size(min=3, max=20,message="name cannot be less than 3 or greater than 20 char")
	private String company;
	
	@NotNull(message="cost should be slected")
	private Long cost;
	
	@NotBlank(message="type should be slected")
	private String type;
	
	@NotBlank(message="country should be slected")
	private String country;
}
