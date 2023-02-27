package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;
import model.Subject;


public class Viewdata {
	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(Subject.class)
							.addAnnotatedClass(Student.class)
							.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
//		List<Subject> sub = session.createQuery("from Subject").list();
//		
//		for(Subject s : sub)
//		{
//			System.out.println(s.getSubid()+" "+s.getSubname());
//			for(Student std : s.getStd())
//			{
//				System.out.println(std.getStid()+" "+std.getStname());
//			}
//		}
//		
		
		Subject s = session.load(Subject.class, 3);
		System.out.println(s.getSubid()+" "+s.getSubname());
		for(Student std : s.getStd())
		{
			System.out.println(std.getStid()+" "+std.getStname());
		}
		

		
		
		
		
	}
}
