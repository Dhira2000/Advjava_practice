package com.demoPractice.Hib;

import java.util.List;

public class AddCustomerAndAddress {
	public static void main(String[] args) {
		CustomerAddressDao dao = new CustomerAddressDao();
	/*	
	 * 
	 *insert
		Customer c = new Customer();
		c.setName("Majrul");
		c.setEmail("majrul@gmail");
		dao.add(c);
		
		Address a = new Address();
		a.setPincode(400001);
		a.setCity("Mumbai");
		a.setState("Maharashtra");
		dao.add(a);
		*/
		
		/*
		Customer c=dao.fetchCustomer(1);
		Address a=dao.fetchAddress(1);
		
		c.setAddress(a);
		dao.update(c);
		*/
		
		/*
		//cascading: we have to insert customer and address at same time
		Customer c=new Customer();
		c.setEmail("ash@outlook");
		c.setName("wini");
		
		Address a=new Address();
		a.setCity("nashik");
		a.setPincode(416002);
		a.setState("maharashtra");
		
		c.setAddress(a);
		dao.add(c);*/
		
		/*
		//List<Customer> list=dao.fetchCustomersByEmail("gmail");
		List<Customer> list=dao.fetchCustomersByCity("nashik");
		for(Customer c:list) {
			System.out.println(c.getId()+"   "+c.getName()+"   "+c.getEmail());
		}*/
		
		Address a=dao.fetchAddressByCustomerName("Majrul");
		System.out.println(a.getId()+" "+a.getCity()+" "+a.getPincode());
	}
	//UML diagram
	//Unidirectional and Bidirectional association
	
	//in RDBMS,unidirectional
	//in javacode,both
}
