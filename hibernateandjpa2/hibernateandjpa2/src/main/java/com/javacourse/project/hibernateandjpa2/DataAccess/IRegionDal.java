package com.javacourse.project.hibernateandjpa2.DataAccess;

import java.util.List;

import com.javacourse.project.hibernateandjpa2.Entities.Region;

public interface IRegionDal {
	List<Region>GetAll();
	void add(Region region);
	void update(Region region);
	void delete(Region region);
	Region getById(int id);	
}
