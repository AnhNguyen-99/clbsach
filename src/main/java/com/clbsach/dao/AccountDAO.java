package com.clbsach.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.entity.Account;
import com.clbsach.entity.AccountRole;

@Repository(value = "accountDAO")
@Transactional(rollbackFor = Exception.class)
public class AccountDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Account login(String accountName, String accountPass) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM Account WHERE accountName =:accountName AND accountPass =:accountPass", Account.class).setParameter("accountName", accountName).setParameter("accountPass", accountPass).uniqueResult();
	}
	
	public AccountRole login_role(int accountId) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(AccountRole.class, accountId);
	}
	
	public int total_roleId(int accountId) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM AccountRole WHERE accountId =:accountId", AccountRole.class).getResultList().size();
	}
	
	public List<AccountRole> getListByAccountId(int accountId){
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM AccountRole WHERE accountId =:accountId", AccountRole.class).setParameter("accountId", accountId).getResultList();
	}
}
