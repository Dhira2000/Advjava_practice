package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("ccv")
public class CurrencyConverter {
		public double converter(String to,String from,double amount) {
			if(to.equalsIgnoreCase("USD") && from.equalsIgnoreCase("INR"))
				return 78.91 * amount;
			else if(to.equalsIgnoreCase("GBR") && from.equalsIgnoreCase("INR"))
				return 94.41*amount;
			else 
				return 0;
		}
}
