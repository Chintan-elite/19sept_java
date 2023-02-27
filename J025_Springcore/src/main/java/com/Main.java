package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contxt = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Student st = contxt.getBean("std",Student.class);
		st.display();
		
		
	}
}
