package com.xworkz.matta.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.matta.entity.MattaEntity;
@Repository
public class MattaRepoImpl implements MattaRepo {
	
	public MattaRepoImpl() {
	System.out.println("Running " + this.getClass().getSimpleName());
	}

	@Autowired
	public EntityManagerFactory entityManagerFactory;
	
	@Override
	public boolean save(MattaEntity mattaEntity) {
		EntityManager entityManager =  this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(mattaEntity);
		entityTransaction.commit();
		entityManager.close();
		return true;
	}
	
	@Override
	public MattaEntity findbyId(int id) {
		System.out.println("Fing by id Repo:"+id);
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		MattaEntity mattaEntity =entityManager.find(MattaEntity.class,id);
		entityManager.close();
		return mattaEntity;
	}

}
