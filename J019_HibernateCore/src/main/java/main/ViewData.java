package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;

public class ViewData {
	public static void main(String[] args) {
		
		
		

		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		cfg = cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		List<Student> st = s.createQuery("from Student").list();
		
		for(Student std : st)
		{
			System.out.println(std.getId()+" "+std.getName()+" "+std.getEmail());
		}
		
	}
}
