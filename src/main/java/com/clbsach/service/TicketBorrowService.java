package com.clbsach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.dao.TicketBorrowDAO;
import com.clbsach.entity.Ticketborrow;

@Service
@Transactional
public class TicketBorrowService {

	@Autowired
	private TicketBorrowDAO ticketBorrowDAO;
	
	public boolean save(Ticketborrow ticketborrow) {
		return ticketBorrowDAO.save(ticketborrow);
	}
	
	public boolean update(Ticketborrow ticketborrow) {
		return ticketBorrowDAO.update(ticketborrow);
	}
	
	public List<Ticketborrow> getAll(){
		return ticketBorrowDAO.getAll();
	}
	
	public Ticketborrow findById(int ticketborrowId) {
		return ticketBorrowDAO.findById(ticketborrowId);
	}
}
