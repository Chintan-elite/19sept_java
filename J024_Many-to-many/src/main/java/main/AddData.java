package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Country;
import model.State;


public class AddData {
	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(Country.class)
							.addAnnotatedClass(State.class)
							.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Country c1 = new Country();
		c1.setCname("India");
		
		State s1 = new State();
		s1.setSname("Gujarat");
		s1.setCountry(c1);
		
		
		State s2 = new State();
		s2.setSname("Mh");
		s2.setCountry(c1);
		
		
		
		session.save(c1);
		session.save(s1);
		session.save(s2);
		
		
		
		tx.commit();
		
		
		
		
		
	}
}
