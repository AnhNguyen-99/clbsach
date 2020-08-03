package com.clbsach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.dao.NewsDAO;
import com.clbsach.entity.News;

@Service
@Transactional
public class NewsService {

	@Autowired
	private NewsDAO newsDAO;
	
	public boolean save(News news) {
		return newsDAO.save(news);
	}
	
	public boolean update(News news) {
		return newsDAO.update(news);
	}
	
	public boolean delete(News news) {
		return newsDAO.delete(news);
	}
	
	public List<News> getAll(){
		return newsDAO.getAll();
	}
	
	public News findById(int newsId) {
		return newsDAO.findById(newsId);
	}
	
}
