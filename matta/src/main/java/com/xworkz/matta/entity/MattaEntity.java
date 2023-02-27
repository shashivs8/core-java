package com.xworkz.matta.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@NoArgsConstructor
@Table(name = "matta")
public class MattaEntity {
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "swamiji")
	private String swamijiName;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "fund")
	private String fund;

}
