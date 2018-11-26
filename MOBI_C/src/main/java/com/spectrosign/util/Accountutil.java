package com.spectrosign.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.spectrosign.user.model.Account;
import com.spectrosign.user.service.IAccountService;

@Component
public class Accountutil {
	@Autowired
	private IAccountService service;
	public List<Account> getalldetails(){
		 
		return service.getalldetails();
		
	}
}
