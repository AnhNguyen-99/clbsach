package com.clbsach.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.entity.User;

@Repository(value = "userDAO")
@Transactional(rollbackFor = Exception.class)
public class UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean save(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.save(user);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public boolean update(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.merge(user);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public boolean delete(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.delete(user);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public List<User> getAll(){
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM User", User.class).getResultList();
	}
	
	public User findById(int userId) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(User.class, userId);
	}
	
	public User findByName(String userName) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM User WHERE username =:username", User.class).setParameter("username", userName).uniqueResult();
	}
	
	public User login(String username, String password) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM User WHERE username =:username AND password =:password", User.class).setParameter("username", username).setParameter("password", password).uniqueResult();
	}
}
