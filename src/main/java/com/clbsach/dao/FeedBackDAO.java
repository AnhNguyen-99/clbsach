package com.clbsach.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.entity.Feedback;

@Repository(value = "feedBackDAO")
@Transactional(rollbackFor = Exception.class)
public class FeedBackDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean save(Feedback feedBack) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.save(feedBack);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	public boolean update(Feedback feedBack) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.merge(feedBack);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public boolean delete(Feedback feedBack) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.delete(feedBack);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public List<Feedback> getAll(){
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM Feedback", Feedback.class).getResultList();
	}
	
	public Feedback findById(int feedBackId) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(Feedback.class, feedBackId);
	}
}
