package com.clbsach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.dao.UserDAO;
import com.clbsach.entity.User;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
	public boolean save(User user) {
		return userDAO.save(user);
	}
	
	public boolean update(User user) {
		return userDAO.update(user);
	}
	
	public boolean delete(User user) {
		return userDAO.delete(user);
	}
	
	public List<User> getAll(){
		return userDAO.getAll();
	}
	
	public User findById(int userId) {
		return userDAO.findById(userId);
	}
	
	public User findByName(String userName) {
		return userDAO.findByName(userName);
	}
	
	public User login(String username, String password) {
		return userDAO.login(username, password);
	}
}
