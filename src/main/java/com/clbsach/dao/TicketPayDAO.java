package com.clbsach.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.entity.Ticketpay;

@Repository(value = "ticketPayDAO")
@Transactional(rollbackFor = Exception.class)
public class TicketPayDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean save(Ticketpay ticketpay) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.save(ticketpay);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public List<Ticketpay> getAll(){
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM Ticketpay", Ticketpay.class).getResultList();
	}
	
}
