package com.javacourse.project.hibernateandjpa2.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateandjpa2.Entities.Region;

@Repository
public class HibernateRegionDal implements IRegionDal{

	private EntityManager entityManager;
	
	public HibernateRegionDal(EntityManager entityManager) {
		//super();
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<Region> GetAll() {
		
				Session session=entityManager.unwrap(Session.class);
				
				List<Region>region=session.createQuery("from region",Region.class).getResultList();
				return region;
	}

	@Override
	public void add(Region region) {
		Session session=entityManager.unwrap(Session.class);
		  session.saveOrUpdate(region);
		
	}

	@Override
	public void update(Region region) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(region);
		
	}

	@Override
	public void delete(Region region) {
		Session session=entityManager.unwrap(Session.class);
		Region regionToDelete=session.get(Region.class,region.getRegionId());
		session.delete(regionToDelete);
		
	}

	@Override
	public Region getById(int id) {
		Session session=entityManager.unwrap(Session.class);
		Region region=session.get(Region.class,id);
		return region;
	}

}
