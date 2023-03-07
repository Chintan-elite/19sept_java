package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repo.BookRepo;

@Service
public class BookserviceImpl implements BookService {

	@Autowired
	BookRepo bookRepo;
	
	@Override
	public Book addBook(Book b) {
		
		Book bk = bookRepo.save(b);
		return bk;
	}

	@Override
	public List<Book> getallBook() {
		return bookRepo.findAll();
	}

	@Override
	public Book getBookById(int id) {
		return bookRepo.getById(id);
	}

	@Override
	public void deleteBook(int id) {
		bookRepo.deleteById(id);
	}

	@Override
	public void UpdateBook(Book b, int id) {
		bookRepo.save(b);
	}

}
