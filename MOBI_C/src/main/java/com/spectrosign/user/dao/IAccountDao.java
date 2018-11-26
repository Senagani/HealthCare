package com.spectrosign.user.dao;

import java.util.List;

import com.spectrosign.user.model.Account;

public interface IAccountDao {
public void SavePayment(Account a);
public List<Account> getalldetails();
}
