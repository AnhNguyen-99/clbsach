package com.clbsach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.dao.TicketPayDAO;
import com.clbsach.entity.Ticketpay;

@Service
@Transactional
public class TicketPayService {

	@Autowired
	private TicketPayDAO ticketPayDAO;
	
	public boolean save(Ticketpay ticketpay) {
		return ticketPayDAO.save(ticketpay);
	}
	
	public List<Ticketpay> getAll(){
		return ticketPayDAO.getAll();
	}
}
