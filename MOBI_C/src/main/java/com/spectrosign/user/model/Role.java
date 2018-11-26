package com.spectrosign.user.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
	
private String role;
@ManyToMany(mappedBy="user")
private List<User> user;
public Role() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public List<User> getUser() {
	return user;
}
public void setUser(List<User> user) {
	this.user = user;
}
public Role(int id, String role, List<User> user) {
	super();
	this.id = id;
	this.role = role;
	this.user = user;
}

}
