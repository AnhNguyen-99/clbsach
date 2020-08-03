package com.clbsach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.dao.AuthorDAO;
import com.clbsach.entity.Author;

@Service
@Transactional
public class AuthorService {

	@Autowired
	private AuthorDAO authorDAO;
	
	public boolean save(Author author) {
		return authorDAO.save(author);
	}
	
	public boolean update(Author author) {
		return authorDAO.update(author);
	}
	
	public boolean delete(Author author) {
		return authorDAO.delete(author);
	}
	
	public List<Author> getAll() {
		return authorDAO.getAll();
	}
	
	public Author findById(int authorId) {
		return authorDAO.findById(authorId);
	}
	
}
