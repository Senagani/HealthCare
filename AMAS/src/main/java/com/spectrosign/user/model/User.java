package com.spectrosign.user.model;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="mobi_c_user")
public class User {
	@Id
	

private  int     id;

private  String  username;
 
private String   password;
	@NotEmpty
private String   firstname;
	@NotEmpty
private String   lastname;
	@NotEmpty
private String   asset;
	@NotNull
private int     blocks;
	@NotNull
private int     flats;
	
  @Email
private String  email;
  private Set<UserRole> userRole = new HashSet<UserRole>(0);
  
 
public Set<UserRole> getUserRole() {
	return userRole;
}
public void setUserRole(Set<UserRole> userRole) {
	this.userRole = userRole;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getAsset() {
	return asset;
}
public void setAsset(String asset) {
	this.asset = asset;
}
public int getBlocks() {
	return blocks;
}
public void setBlocks(int blocks) {
	this.blocks = blocks;
}
public int getFlats() {
	return flats;
}
public void setFlats(int flats) {
	this.flats = flats;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}



public User(int id, String username, String password, String firstname, String lastname, String asset, int blocks,
		int flats, String email) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.firstname = firstname;
	this.lastname = lastname;
	this.asset = asset;
	this.blocks = blocks;
	this.flats = flats;
	this.email = email;
	
}

@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstname=" + firstname
			+ ", lastname=" + lastname + ", asset=" + asset + ", blocks=" + blocks + ", flats=" + flats + ", email="
			+ email + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((asset == null) ? 0 : asset.hashCode());
	result = prime * result + blocks;
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
	result = prime * result + flats;
	result = prime * result + id;

	result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
	result = prime * result + ((password == null) ? 0 : password.hashCode());
	result = prime * result + ((username == null) ? 0 : username.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	if (asset == null) {
		if (other.asset != null)
			return false;
	} else if (!asset.equals(other.asset))
		return false;
	if (blocks != other.blocks)
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (firstname == null) {
		if (other.firstname != null)
			return false;
	} else if (!firstname.equals(other.firstname))
		return false;
	if (flats != other.flats)
		return false;
	if (id != other.id)
		return false;
	
	if (lastname == null) {
		if (other.lastname != null)
			return false;
	} else if (!lastname.equals(other.lastname))
		return false;
	if (password == null) {
		if (other.password != null)
			return false;
	} else if (!password.equals(other.password))
		return false;
	if (username == null) {
		if (other.username != null)
			return false;
	} else if (!username.equals(other.username))
		return false;
	return true;
}
public User(int id) {
this.id=id;
	
	// TODO Auto-generated constructor stub
}
public User(){
	
}



}