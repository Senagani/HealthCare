package com.spectrosign.user.service;

import java.util.List;

import com.spectrosign.user.model.User;

public interface IuserService {
	//boolean check(User u);
	public void saveUser(User u);
	public List<User> getuser();
	public void deleteuse(int id);
	public User getLocationById(int id);
	public void update(User u);
	public List<User> check(String username,String password);

}
