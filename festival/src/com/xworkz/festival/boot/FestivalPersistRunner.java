package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.festival.entity.FestivalEntity;

public class FestivalPersistRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		FestivalEntity entity = new FestivalEntity("Ugadi", "Hindu",1, "obbattu", "lakshmi");
		FestivalEntity entity1 = new FestivalEntity("Id-Milad", "Muslim",1, "Biryani", "Allah");
		FestivalEntity entity2 = new FestivalEntity("Cristhmas", "Cristchien",1, "Non Veg", "Jesus");
		
		manager.persist(entity);
		manager.persist(entity1);
		manager.persist(entity2);
		transaction.commit();
		manager.close();
	}

}
