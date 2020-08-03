package com.clbsach.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.entity.Publishing;

@Repository(value = "publishingDAO")
@Transactional(rollbackFor = Exception.class)
public class PublishingDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean save(final Publishing publishing) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.save(publishing);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public boolean update(final Publishing publishing) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.merge(publishing);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public boolean delete(final Publishing publishing) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.delete(publishing);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public List<Publishing> getAll(){
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM Publishing", Publishing.class).getResultList();
	}
	
	public Publishing findById(int publishingId) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(Publishing.class, publishingId);
	}
}
