package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.Atm;
import com.cdac.component.Calculator;
import com.cdac.component.CurrencyConverter;
import com.cdac.component.HelloWorld;

public class App {

	public static void main(String[] args) {
		//Loading spring/IOC container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("my-spring-config.xml");
		
		HelloWorld hw=(HelloWorld)ctx.getBean("Hello");
		System.out.println(hw.sayHello("Dhiraj"));
		
		Calculator ct= ctx.getBean("calc",Calculator.class);
		System.out.println(ct.add(10,20));
		System.out.println(ct.sub(10,20));
		
		CurrencyConverter cc=(CurrencyConverter) ctx.getBean("ccv");
		System.out.println(cc.converter("usd", "inr", 10));
		//System.out.println(cc.converter("usdr", "inr", 10));
	
		Atm atm=ctx.getBean("hdfcAtm",Atm.class);
		atm.withdrawl(1111, 1000);
	}

}
