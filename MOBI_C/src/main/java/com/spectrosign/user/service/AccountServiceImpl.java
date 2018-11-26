package com.spectrosign.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spectrosign.user.dao.IAccountDao;
import com.spectrosign.user.model.Account;
@Service
public class AccountServiceImpl implements IAccountService {
	@Autowired
private IAccountDao dao;
	public void SavePayment(Account a) {
		
		dao.SavePayment(a);
	}

	public List<Account> getalldetails() {
		
		return dao.getalldetails();
	}

}
