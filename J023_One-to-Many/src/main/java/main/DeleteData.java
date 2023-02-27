package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;
import model.Subject;


public class Deletedata {
	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(Subject.class)
							.addAnnotatedClass(Student.class)
							.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		

	
		
		Subject s = session.load(Subject.class, 3);
		
		session.delete(s);
		
		tx.commit();

		
		
		
		
	}
}
