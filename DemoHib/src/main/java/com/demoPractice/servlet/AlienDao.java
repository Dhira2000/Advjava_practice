package com.demoPractice.servlet;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

// Data Access Object
///classes which contain database related code called
public class AlienDao {
	

		public void add(Alien al) {
			// after this step we're able to read persistence.xml file
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_hibernate");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();

			em.persist(al);// persist method will generate insert query
			tx.commit();

			emf.close();
		}
		
		public Alien fetch(int aId) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_hibernate");
			EntityManager em = emf.createEntityManager();
			
			//find method generates select  query where pk=?
			Alien al=em.find(Alien.class, aId);
			emf.close();
			return al;
			
		}
		
		public List<Alien> fetchAll(){
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_hibernate");
			EntityManager em = emf.createEntityManager();
			
			Query q=em.createQuery("select a from Alien a");//HQL//JPQL
			List<Alien> list=q.getResultList();
			emf.close();
			return list;
		}
		
		public List<String> fetchAllNames(){
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_hibernate");
			EntityManager em = emf.createEntityManager();
			
			Query q=em.createQuery("select a.aName from Alien a");//HQL//JPQL
			List<String> list=q.getResultList();
			emf.close();
			return list;
		}
		
		public List<Object[]> fetchAllNamesAndColour(){
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_hibernate");
			EntityManager em = emf.createEntityManager();
			
			Query q=em.createQuery("select a.aName,a.Color from Alien a");//HQL//JPQL
			List<Object[]> list=q.getResultList();
			emf.close();
			return list;
		}
		
		public List<Alien> fetchAllbyaId(int aId){
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_hibernate");
			EntityManager em = emf.createEntityManager();
			
			Query q=em.createQuery("select a from Alien a where a.aId>=:id");//HQL//JPQL
			q.setParameter("id", aId);
			List<Alien> list=q.getResultList();
			emf.close();
			return list;
		}
	}

