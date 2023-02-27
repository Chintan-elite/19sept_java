package org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String[] args) {
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext1.xml");
		
		Questions que = context.getBean("que",Questions.class);
		que.display();
		
		
	}
}
