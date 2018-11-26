package com.spectrosign.util;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spectrosign.user.model.User;
import com.spectrosign.user.service.IuserService;


@Component
public class Userutil {
@Autowired
private IuserService service;

public List<User> getalluser(){
	List<User> l=service.getuser();
	return l;
	
}
public  List<User> getLogin(String username, String password){

	return service.check(username, password);
	

}

}
