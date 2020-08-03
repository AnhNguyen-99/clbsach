package com.clbsach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.dao.BookDAO;
import com.clbsach.entity.Book;

@Service
@Transactional
public class BookService {

	@Autowired
	private BookDAO bookDAO;
	
	public boolean save(Book book) {
		return bookDAO.save(book);
	}
	
	public boolean update(Book book) {
		return bookDAO.update(book);
	}
	
	public boolean delete(Book book) {
		return bookDAO.delete(book);
	}
	
	public List<Book> getAll(){
		return bookDAO.getAll();
	}
	
	public Book findById(int bookId) {
		return bookDAO.findById(bookId);
	}
}
