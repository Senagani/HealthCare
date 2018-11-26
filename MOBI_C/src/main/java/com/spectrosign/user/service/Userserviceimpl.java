package com.spectrosign.user.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spectrosign.user.dao.ILoginDao;
import com.spectrosign.user.model.Role;
import com.spectrosign.user.model.User;
import com.spectrosign.user.model.Userstatus;

@Service("UserDetailsService")
public class Userserviceimpl implements UserDetailsService{
	@Autowired
private ILoginDao dao;
@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	User user=dao.finduserby(username);
	String password=user.getPassword();
	boolean enabled=user.getStatus().equals(Userstatus.ACTIVE);
	Collection<GrantedAuthority> authoritys=new ArrayList<GrantedAuthority>();
	for(Role role:user.getRole()){
		authoritys.add(new GrantedAuthorityImpl(role.getRole()));
	}
org.springframework.security.core.userdetails.User securityUser=new org.springframework.security.core.userdetails.User(username, password, authoritys);
if(user!=null)
		return securityUser;
else
	
return (UserDetails) new UsernameNotFoundException("user not found");

}









	

}
