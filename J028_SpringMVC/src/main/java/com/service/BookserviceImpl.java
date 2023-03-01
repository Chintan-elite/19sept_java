package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Bookdao;
import com.model.Book;

@Service
public class BookserviceImpl implements BookService {

	@Autowired
	Bookdao bookdao;
	@Override
	public void addorUpdateBook(Book b) {
		bookdao.addorUpdateBook(b);
		
	}

	@Override
	public List<Book> getallBook() {
		// TODO Auto-generated method stub
		return bookdao.getallBook();
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return bookdao.getBookById(id);
	}

	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		bookdao.deleteBook(id);
	}

}
