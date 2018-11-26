package com.spectrosign.user.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spectrosign.user.model.User;
import com.spectrosign.util.Mailutil;

@Repository
@Transactional
public class LoginDaoimp implements ILoginDao {
	@Autowired
	 private HibernateTemplate ht;
	@Autowired
private Mailutil mail;
	public List<User> check(String username,String password) {
		@SuppressWarnings("unchecked")
		List<User> l= (List<User>) ht.find("from User where username=? and password=?", username,password);
		
		return l;
}
	// save the user in database
	public void saveUser(User u){

			 String s=u.getFirstname();
			    String s1= s+987;
			    String m=u.getEmail();
			    String p=u.getFirstname();
			    String p1=p+1234;
			    u.setUsername(s1);
			    u.setPassword(p1);
			    ht.save(u);
			    String creditions="user name is  "+s1+"  password is   "+p1;
			  
			    mail.Sendmail(m, "from mobi_c", creditions);
				
			 
		
		
		
		
		}
	// get the all user
	public List<User> getuser() {
		List<User> l=ht.loadAll(User.class);
		return l;
}
	// delete user 
public void deleteuse(int id) {
	
	ht.delete(new User(id));
}
//get id
public User getLocationById(int id) {
	User user=ht.get(User.class, id);
	return user;
}
//update user
public void update(User u) {
	ht.update(u);
}


	

}
