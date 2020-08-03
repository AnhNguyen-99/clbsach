package com.clbsach.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.entity.Book;

@Repository(value = "bookDAO")
@Transactional(rollbackFor = Exception.class)
public class BookDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean save(Book book) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.save(book);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public boolean update(Book book) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.merge(book);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public boolean delete(Book book) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.delete(book);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public List<Book> getAll(){
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM Book", Book.class).getResultList();
	}
	
	public Book findById(int bookId) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(Book.class, bookId);
	}
	
}
