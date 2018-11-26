package com.spectrosign.user.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spectrosign.user.model.Account;
@Repository
@Transactional
public class Accountimpl implements IAccountDao {


	@Autowired
	private HibernateTemplate ht;

	public void SavePayment(Account a) {
		ht.save(a);
		
	}

	public List<Account> getalldetails() {
	
		return ht.loadAll(Account.class);
	}

}
