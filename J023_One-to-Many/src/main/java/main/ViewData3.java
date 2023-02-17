package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Country;
import model.State;


public class ViewData3 {
	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(Country.class)
							.addAnnotatedClass(State.class)
							.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
//		Country c = session.load(Country.class, 5);
//		System.out.println(c.getCname());
//		for(State s : c.getState())
//		{
//			System.out.println(s.getSname());
//		}
		
		List<Country> country = session.createQuery("from Country").list();
		for(Country c : country)
		{
			System.out.println(c.getCname());
			for(State s : c.getState())
			{
				System.out.println(s.getSname());
			}
		}
		tx.commit();
		
		
		
		
		
	}
}
