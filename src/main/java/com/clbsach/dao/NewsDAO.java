package com.clbsach.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.entity.News;

@Repository(value = "newsDAO")
@Transactional(rollbackFor = Exception.class)
public class NewsDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean save(News news) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.save(news);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public boolean update(News news) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.merge(news);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public boolean delete(News news) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.delete(news);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public List<News> getAll(){
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM News", News.class).getResultList();
	}
	
	public News findById(int newsId) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(News.class, newsId);
	}
}
