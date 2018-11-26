package com.spectrosign.user.service;

import java.util.List;

import com.spectrosign.user.model.Account;

public interface IAccountService {
	public void SavePayment(Account a);
	public List<Account> getalldetails();
}
