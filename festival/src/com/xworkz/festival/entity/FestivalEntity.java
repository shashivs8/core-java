package com.xworkz.festival.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@NoArgsConstructor
@Table(name = "festivals")
@NamedQuery(name = "findByIdAndName", query = "select anything.name from FestivalEntity anything where anything.id='1' ")
public class FestivalEntity {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "region")
	private String region;
	
	@Column(name = "totalDays")
	private int totalDays;
	
	@Column(name = "sweets")
	private String sweets;
	
	@Column(name = "mainGod")
	private String mainGod;

	public FestivalEntity(String name, String region, int totalDays, String sweets, String mainGod) {
		super();
		this.name = name;
		this.region = region;
		this.totalDays = totalDays;
		this.sweets = sweets;
		this.mainGod = mainGod;
	}
	
	

}
