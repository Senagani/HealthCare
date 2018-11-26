package com.spectrosign.user.dao;

import java.util.List;

import com.spectrosign.user.model.User;
public interface ILoginDao {
	//List check(User u);
	public List<User> check(String username,String password);
	public void saveUser(User u);
    public List<User> getuser();
	public void deleteuse(int id);
	public User getLocationById(int id);
	public void update(User u);

	
}
