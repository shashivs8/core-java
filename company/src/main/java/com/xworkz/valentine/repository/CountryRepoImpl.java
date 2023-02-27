package com.xworkz.valentine.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.valentine.entity.CountryEntity;

public class CountryRepoImpl implements CountryRepo {

	public CountryRepoImpl() {
		System.out.println("Running " + this.getClass().getSimpleName());
	}

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public boolean save(CountryEntity entity) {
		System.out.println("running save in repository");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return true;
	}

	@Override
	public CountryEntity findById(int id) {
		System.out.println("find Id in repo.." + id);

		EntityManager entityManager = this.entityManagerFactory.createEntityManager();

		CountryEntity airoplaneEntityDto = entityManager.find(CountryEntity.class, id);

		entityManager.close();

		return airoplaneEntityDto;
	}

}
