package com.javacourse.project.hibernateandjpa2.Entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="region")
public class Region {
	@Id
	@Column(name="regionId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int regionId;
	
	@Column(name="regiondescription")
	private String regiondescription;
	
	public Region() {
		
	}
	public Region(int regionId, String regiondescription) {
		super();
		this.regionId = regionId;
		this.regiondescription = regiondescription;
	}
	

	public int getRegionId() {
		return regionId;
	}


	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}


	public String getRegiondescription() {
		return regiondescription;
	}


	public void setRegiondescription(String regiondescription) {
		this.regiondescription = regiondescription;
	}

}