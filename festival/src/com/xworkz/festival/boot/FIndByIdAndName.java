package com.xworkz.festival.boot;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FIndByIdAndName {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByIdAndName");
		 List list= query.getResultList();
		System.out.println(list);

	}

}
