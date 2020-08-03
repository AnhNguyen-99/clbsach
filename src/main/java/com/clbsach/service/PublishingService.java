package com.clbsach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.dao.PublishingDAO;
import com.clbsach.entity.Publishing;

@Service
@Transactional
public class PublishingService {

	@Autowired
	private PublishingDAO publishingDAO;
	
	public boolean save(final Publishing publishing) {
		return publishingDAO.save(publishing);
	}
	
	public boolean update(final Publishing publishing) {
		return publishingDAO.update(publishing);
	}
	
	public boolean delete(final Publishing publishing) {
		return publishingDAO.delete(publishing);
	}
	
	public List<Publishing> getAll(){
		return publishingDAO.getAll();
	}
	
	public Publishing findById(final int publishingId) {
		return publishingDAO.findById(publishingId);
	}
	
}
