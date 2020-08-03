package com.clbsach.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.entity.Author;

@Repository(value = "authorDAO")
@Transactional(rollbackFor = Exception.class)
public class AuthorDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean save(final Author author) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.save(author);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public boolean update(final Author author) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.merge(author);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public boolean delete(final Author author) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.delete(author);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public List<Author> getAll(){
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM Author", Author.class).getResultList();
	}
	
	public Author findById(int authorId) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(Author.class, authorId);
	}
	
}
