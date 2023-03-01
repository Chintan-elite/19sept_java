package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Book;

@Repository
@Transactional
public class BookDaoImpl implements Bookdao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addorUpdateBook(Book b) {
		
		Session s = sessionFactory.openSession();
		Transaction tx  =s.beginTransaction();
		s.saveOrUpdate(b);
		tx.commit();
		
	}

	@Override
	public List<Book> getallBook() {
		Session s = sessionFactory.openSession();
		Transaction tx  =s.beginTransaction();
		
		return s.createQuery("from Book").list();
	}

	@Override
	public Book getBookById(int id) {
		Session s = sessionFactory.openSession();
		Transaction tx  =s.beginTransaction();
		
		return s.get(Book.class, id);
	}

	@Override
	public void deleteBook(int id) {
		Session s = sessionFactory.openSession();
		Transaction tx  =s.beginTransaction();
		s.delete(s.get(Book.class, id));
		tx.commit();
	}

}
