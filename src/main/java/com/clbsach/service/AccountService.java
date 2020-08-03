package com.clbsach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clbsach.dao.AccountDAO;
import com.clbsach.entity.Account;
import com.clbsach.entity.AccountRole;

@Service
@Transactional
public class AccountService {

	@Autowired
	private AccountDAO accountDAO;
	
	public Account login(String accountName, String accountPass) {
		return accountDAO.login(accountName, accountPass);
	}
	
	public AccountRole login_role(int accountId) {
		return accountDAO.login_role(accountId);
	}
	
	public int total_roleId(int accountId) {
		return accountDAO.total_roleId(accountId);
	}
	public List<AccountRole> getListByAccountId(int accountId){
		return accountDAO.getListByAccountId(accountId);
	}
}
