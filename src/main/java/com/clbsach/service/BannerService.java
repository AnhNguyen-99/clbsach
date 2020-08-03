package com.clbsach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.dao.BannerDAO;
import com.clbsach.entity.Banner;

@Service
@Transactional
public class BannerService {

	@Autowired
	private BannerDAO bannerDAO;
	
	public boolean save(Banner banner) {
		return bannerDAO.save(banner);
	}
	
	public boolean update(final Banner banner) {
		return bannerDAO.update(banner);
	}
	
	public boolean delete(final Banner banner) {
		return bannerDAO.delete(banner);
	}
	
	public List<Banner> getAll(){
		return bannerDAO.getAll();
	}
	
	public Banner findById(int bannerId) {
		return bannerDAO.findById(bannerId);
	}
	
}
