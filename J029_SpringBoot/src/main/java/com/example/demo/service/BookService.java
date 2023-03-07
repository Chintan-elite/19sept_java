package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;

public interface BookService {
	
	public Book addBook(Book b);
	public List<Book> getallBook();
	public Book getBookById(int id);
	public void deleteBook(int id);
	public void UpdateBook(Book b, int id);
}
