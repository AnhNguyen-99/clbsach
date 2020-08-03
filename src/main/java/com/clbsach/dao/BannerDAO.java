package com.clbsach.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.entity.Banner;

@Repository(value = "bannerDAO")
@Transactional(rollbackFor = Exception.class)
public class BannerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean save(final Banner banner) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.save(banner);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public boolean update(final Banner banner) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.merge(banner);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public boolean delete(final Banner banner) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.delete(banner);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public List<Banner> getAll(){
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM Banner", Banner.class).getResultList();
	}
	
	public Banner findById(int bannerId) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(Banner.class, bannerId);
	}
}
