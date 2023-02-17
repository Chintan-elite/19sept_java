package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import model.User;
import model.UserDetails;

public class Deletedata {
	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(User.class)
							.addAnnotatedClass(UserDetails.class)
							.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		

		
		User user = session.load(User.class, 2);
		session.delete(user);
		
		
		
		tx.commit();
		
		
		
		
		
	}
}
