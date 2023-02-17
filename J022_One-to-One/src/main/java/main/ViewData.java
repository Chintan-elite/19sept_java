package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import model.User;
import model.UserDetails;

public class ViewData {
	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(User.class)
							.addAnnotatedClass(UserDetails.class)
							.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		

		List<User> u = session.createQuery("from User").list();
		
		for(User ud : u)
		{
			System.out.println(ud.getUname()+" "+ud.getEmail());
			System.out.println(ud.getUserDetails().getYoutube_channel());
		}
		
		
		
		
	}
}
