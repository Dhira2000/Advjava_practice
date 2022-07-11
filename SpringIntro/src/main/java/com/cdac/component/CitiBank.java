package com.cdac.component;

import org.springframework.stereotype.Component;

@Component
public class CitiBank implements Bank {

	public void withdrawl(int atmId, int accno, double amount) {
			System.out.println("customer at citbank");

	}

}
