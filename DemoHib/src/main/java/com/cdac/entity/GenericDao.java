package com.cdac.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GenericDao {
	public void save(Object obj) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_hibernate");
		try {
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
	
			//merge is a 2-in-1 method
			//can be used for insert as well as update both
			em.merge(obj);
			
			tx.commit();
		}
		finally {
			emf.close();
		}
	}

	public Object fetchById(Class clazz, Object pk) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_hibernate");
		try {
			EntityManager em = emf.createEntityManager();
			//find method generates select query where pk = ?
			Object obj = em.find(clazz, pk);
			return obj;	
		}
		finally {
			emf.close();
		}
	}
}
