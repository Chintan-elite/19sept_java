package com.dao;

import java.util.List;

import com.model.Book;

public interface Bookdao {

	public void addorUpdateBook(Book b);
	public List<Book> getallBook();
	public Book getBookById(int id);
	public void deleteBook(int id);
}
