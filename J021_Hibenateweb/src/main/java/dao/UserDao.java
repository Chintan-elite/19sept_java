package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User;

public class UserDao {
	
	SessionFactory sf = null;
	public UserDao() {
		
		sf = new Configuration()
			.configure("resources/hibernate.cfg.xml")
			.addAnnotatedClass(User.class)
			.buildSessionFactory();
	}
	
	public void addUser(User u)
	{
		Session s = sf.openSession();
		Transaction tx  =s.beginTransaction();
		s.saveOrUpdate(u);
		tx.commit();
	}
	
	public List<User> viewUser()
	{
		Session s = sf.openSession();
		Transaction tx  =s.beginTransaction();
		return s.createQuery("from User").list();
	}
	
	public User getById(int id)
	{
		Session s = sf.openSession();
		Transaction tx  =s.beginTransaction();
		return s.get(User.class, id);
	}
	
	public void delete(int id)
	{
		Session s = sf.openSession();
		Transaction tx  =s.beginTransaction();
		User u = s.get(User.class, id);
		s.delete(u);
		tx.commit();
	}
	
}
