package com.clbsach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.dao.CategoryDAO;
import com.clbsach.entity.Category;

@Service
@Transactional
public class CategoryService {

	@Autowired
	private CategoryDAO categoryDAO;
	
	public boolean save(Category category) {
		return categoryDAO.save(category);
	}
	
	public boolean update(Category category) {
		return categoryDAO.update(category);
	}
	
	public boolean delete(Category category) {
		return categoryDAO.delete(category);
	}
	
	public List<Category> getAll(){
		return categoryDAO.getAll();
	}
	
	public Category findById(int categoryId) {
		return categoryDAO.findById(categoryId);
	}
	
}
