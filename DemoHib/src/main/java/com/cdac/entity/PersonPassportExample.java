package com.cdac.entity;

import java.time.LocalDate;
import java.util.List;

public class PersonPassportExample {
	public static void main(String[] args) {
		PersonPassportDao dao = new PersonPassportDao();

		/*
		Person p = new Person();
		p.setName("ashutosh");
		p.setEmail("chinmay.com");
		p.setDateOfBirth(LocalDate.of(1998,11,24));

		Passport ps = new Passport();
		ps.setIssueDate(LocalDate.of(2020, 10, 30));
		ps.setExpiryDate(LocalDate.of(2025,10,30));
		ps.setIssuedBy("Govt. of India");

		p.setPassport(ps);
		ps.setPerson(p);

		dao.add(p);
	*/
		
		/*
		Person p =dao.fetchPersonByPassportNo(3);
		System.out.println(p.getId()+"   "+p.getName());
		*/
	
		
		List<Person> list =dao.fetchPersonsByPassportExpiryYear(2030);
		for(Person p:list)
		System.out.println(p.getId()+"  "+p.getName()+"  "+p.getEmail());
       
	}
		
}
