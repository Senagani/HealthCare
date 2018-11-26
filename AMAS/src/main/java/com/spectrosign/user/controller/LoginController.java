package com.spectrosign.user.controller;

import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spectrosign.user.model.Account;
import com.spectrosign.user.model.User;
import com.spectrosign.util.Accountutil;
import com.spectrosign.util.Userutil;
@Controller
public class LoginController {
	 static Logger log = Logger.getLogger(LoginController.class.getName());
	
	@Autowired
	private Accountutil autil;
	@Autowired
	private Userutil us;
	@RequestMapping("login")
	public ModelAndView getlogin(){
		BasicConfigurator.configure();
		return new ModelAndView("login");
		
		
	}

     @RequestMapping(value="check" ,method=RequestMethod.POST)
public String welcomepage(@RequestParam("username") String username, @RequestParam("password") String password ,ModelMap map){
    	 
    	
    	 List<User> li=us.getLogin(username, password);
    	 if(li.isEmpty()){
    			map.addAttribute("msg", "invalid user");
		return "login";
	
    	 }
    	 else
    		 map.addAttribute("user", li);
    	 List<Account> list=autil.getalldetails();
    		map.addAttribute("payerinfo",list);
    		log.info("Exiting the program");
    		 return "Dashboard";
 		
     }
     @RequestMapping(value="Dashboard")
 	public String getlogin1(ModelMap map){
    	 List<Account> list=autil.getalldetails();
 		map.addAttribute("payerinfo",list);
 	
 		return "Dashboard";
 		
 	}
     
	
}
