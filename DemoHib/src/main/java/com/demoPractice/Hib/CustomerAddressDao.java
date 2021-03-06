package com.demoPractice.Hib;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CustomerAddressDao {
	public void add(Customer cust) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(cust); //persist method will generate insert query
		
		tx.commit();
		emf.close();
	}
	
	public void update(Customer cust) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.merge(cust); //merge method will generate update query
		
		tx.commit();
		emf.close();
	}
	
	public Customer fetchCustomer(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_hibernate");
		EntityManager em = emf.createEntityManager();

		//find method generates select query where pk = ?
		Customer emp = em.find(Customer.class, id);
		
		emf.close();

		return emp;	
	}
	
	
	public List<Customer> fetchCustomersByEmail(String domain) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select c from Customer c where c.email like :em");
		q.setParameter("em", "%" + domain + "%");
		List<Customer> list = q.getResultList();
		
		emf.close();

		return list;
	}

	
	public List<Customer> fetchCustomersByCity(String City) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select c from Customer c join c.address a where a.city like :ct");
		q.setParameter("ct", "%" + City + "%");
		List<Customer> list = q.getResultList();
		
		emf.close();

		return list;
	}

	public Address fetchAddressByCustomerName(String name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select a from Customer c join c.address a where c.name = :nm");
		q.setParameter("nm", name);
		Address addr = (Address) q.getSingleResult();
		
		emf.close();

		return addr;
	}


}
