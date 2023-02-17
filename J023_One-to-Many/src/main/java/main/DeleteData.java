package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Country;
import model.State;


public class DeleteData {
	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(Country.class)
							.addAnnotatedClass(State.class)
							.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Country c1 = session.load(Country.class, 4);
		
		session.delete(c1);
	
		
		
		
		
		
		
		tx.commit();
		
		
		
		
		
	}
}
