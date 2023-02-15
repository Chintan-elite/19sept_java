package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Book;


public class BookDao {
	
	SessionFactory sf;
	public BookDao() {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("resources/hibernate.cfg.xml");
		cfg = cfg.addAnnotatedClass(Book.class);
		 sf = cfg.buildSessionFactory();
	}
	
	public int addBook(Book b)
	{
		int i=1;
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.save(b);
		tx.commit();
		return i;
	}
	
	public List<Book> viewAllBook()
	{
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		return s.createQuery("from Book").list();			
	}

	public Book getbyId(int bid)
	{
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Book b =s.load(Book.class, bid);
		return b;
	}

	public int deletebook(int bid) {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Book b =s.load(Book.class, bid);
		s.delete(b);
		return 1;
	}

	public int updateBook(Book b) {
		int i=1;
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.saveOrUpdate(b);
		tx.commit();
		return i;
		
	}

	public ArrayList<Book> searchBook(String keyword) {
		
		
		ArrayList<Book> al = new ArrayList();
		
		
		return null;
	}
	
	
	
}
