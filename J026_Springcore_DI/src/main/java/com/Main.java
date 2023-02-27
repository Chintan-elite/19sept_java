package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context =new AnnotationConfigApplicationContext(Appconfig.class);
		
		Bank b1 =context.getBean("saving",Bank.class);
		b1.getBalance();
		
		Bank b2 = context.getBean("currentAccount",Bank.class);
		b2.getBalance();
		
		
		
	}
}
