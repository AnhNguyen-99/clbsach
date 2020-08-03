package com.clbsach.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.entity.Ticketborrow;

@Repository(value = "ticketBorrowDAO")
@Transactional(rollbackFor = Exception.class)
public class TicketBorrowDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean save(Ticketborrow ticketborrow) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.save(ticketborrow);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public boolean update(Ticketborrow ticketborrow) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.merge(ticketborrow);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public List<Ticketborrow> getAll(){
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM Ticketborrow", Ticketborrow.class).getResultList();
	}
	
	public Ticketborrow findById(int ticketborrowId) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(Ticketborrow.class, ticketborrowId);
	}
}
