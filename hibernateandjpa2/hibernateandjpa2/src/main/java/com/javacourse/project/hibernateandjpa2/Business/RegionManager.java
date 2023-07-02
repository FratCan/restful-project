package com.javacourse.project.hibernateandjpa2.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateandjpa2.DataAccess.IRegionDal;
import com.javacourse.project.hibernateandjpa2.Entities.Region;

@Service
public class RegionManager implements IRegionService{

	
	private IRegionDal ıregionDal;
	
	@Autowired
	public RegionManager(IRegionDal iregionDal) {
		//super();
		this.ıregionDal = iregionDal;
	}
	
	
	@Override
	@Transactional
	public List<Region> GetAll() {
		return this.ıregionDal.GetAll();
	}

	@Override
	@Transactional
	public void add(Region region) {
		 this.ıregionDal.add(region);
		
	}

	@Override
	@Transactional
	public void update(Region region) {
		this.ıregionDal.update(region);
		
	}

	@Override
	@Transactional
	public void delete(Region region) {
		 this.ıregionDal.delete(region);
		
	}

	@Override
	@Transactional
	public Region getById(int id) {
		return this.ıregionDal.getById(id);
	}


}
