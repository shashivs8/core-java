package com.xworkz.matta.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class MattaDTO {
	
	private int id;
	
	@NotNull(message = "Values does Null Please enter  Company Name")
	@Size(min = 3, max = 30, message = "Size must be grether than 3 less than 30")
	private String name;
	@NotNull(message = "Values does Null Please enter  Company Name")
	@Size(min = 3, max = 30, message = "Size must be grether than 3 less than 30")
	private String swamijiName;
	@NotNull(message = "Values does Null Please enter  Company Name")
	@Size(min = 3, max = 30, message = "Size must be grether than 3 less than 30")
	private String location;
	@NotNull(message = "Values does Null Please enter  Company Name")
	@Size(min = 3, max = 30, message = "Size must be grether than 3 less than 30")
	private String fund;

}
