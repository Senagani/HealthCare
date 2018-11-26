package com.spectrosign.user.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spectrosign.user.dao.ILoginDao;
import com.spectrosign.user.model.User;
import com.spectrosign.user.service.IuserService;
@Service
public class Userserviceimpl implements IuserService{
	@Autowired
private ILoginDao dao;

	public List<User> check(String username,String password) {
		List<User> list=dao.check(username, password);
		return list;
	
			
		
		
	}

	public List<User> getuser() {
		List<User> l=dao.getuser();
		return l;
	}

	public void deleteuse(int id) {
		dao.deleteuse(id);
		
	}

	public User getLocationById(int id) {
	
		return dao.getLocationById(id);
	}

	public void update(User u) {
		dao.update(u);
		
	}

	public void saveUser(User u) {
		 dao.saveUser(u);
		
	}

	




	

}
