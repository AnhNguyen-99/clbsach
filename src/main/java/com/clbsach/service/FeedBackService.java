package com.clbsach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.dao.FeedBackDAO;
import com.clbsach.entity.Feedback;

@Service
@Transactional
public class FeedBackService {

	@Autowired
	private FeedBackDAO feedBackDAO;
	
	public boolean save(Feedback feedBack) {
		return feedBackDAO.save(feedBack);
	}
	
	public boolean update(Feedback feedback) {
		return feedBackDAO.update(feedback);
	}
	
	public boolean delete(Feedback feedback) {
		return feedBackDAO.delete(feedback);
	}
	
	public List<Feedback> getAll(){
		return feedBackDAO.getAll();
	}
	
	public Feedback findById(int feedBackId) {
		return feedBackDAO.findById(feedBackId);
	}
}
