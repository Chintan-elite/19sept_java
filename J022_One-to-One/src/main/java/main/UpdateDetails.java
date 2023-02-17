package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import model.User;
import model.UserDetails;

public class UpdateDetails {
	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(User.class)
							.addAnnotatedClass(UserDetails.class)
							.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		

		
		User user = session.load(User.class, 1);
		user.getUserDetails().setYoutube_channel("abcd");
		
//		UserDetails userDetails = new UserDetails();
//		userDetails.setYoutube_channel("selenium");
//		userDetails.setUser(user);
		
		
		session.save(user);
		
		
		tx.commit();
		
		
		
		
		
	}
}
