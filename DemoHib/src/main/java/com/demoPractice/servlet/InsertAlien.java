package com.demoPractice.servlet;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertAlien {
	
	public static void main(String[] args) {
		
		/*
		Alien al =new Alien();
		al.setaId(4);
		al.setaName("Jack");
		al.setColor("Green");
		
		AlienDao dao=new AlienDao();
		dao.add(al);
		*/
		
		
		/*
		//select
		AlienDao dao=new AlienDao();
		Alien al=dao.fetch(1);
		System.out.println(al.getaName()+" "+al.getColor());
		*/
		
		
		AlienDao dao=new AlienDao();
		List<Alien> list=dao.fetchAll();
		for(Alien al:list)
			System.out.println(al.getaName()+" "+al.getColor()+" "+al.getaId());
		
		System.out.println("**************");
		
		List<String> names=dao.fetchAllNames();
		for(String name:names)
			System.out.println(name);
		
		System.out.println("**********************");
		List<Object[]> namesAndColor=dao.fetchAllNamesAndColour();
		for(Object[]  arr : namesAndColor)
			System.out.println(arr[0]+" "+arr[1] );
		
		
		System.out.println("*********************");
		List<Alien> list2=dao.fetchAllbyaId(2);
		for(Alien al:list2)
			System.out.println(al.getaName()+" "+al.getColor());
		
	}
	
	/*
		public static void main(String[] args) {
			
			//after this step we're able to read persistence.xml file
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo_hibernate");
			EntityManager em=emf.createEntityManager();
			EntityTransaction tx=em.getTransaction();
			tx.begin();
			
			Alien al =new Alien();
			al.setaId(3);
			al.setaName("Oggy");
			al.setColor("Blue");
			
			em.persist(al);//persist method will generate insert query
			tx.commit();
			
			emf.close();
		}
		*/
}
