package com.spectrosign.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spectrosign.user.model.Account;
import com.spectrosign.user.model.User;
import com.spectrosign.user.service.IAccountService;
import com.spectrosign.util.Userutil;
@Controller
public class AccountController {
	@Autowired
	private IAccountService service;
	@Autowired
	private Userutil Utils;
	
@RequestMapping("pay")
	public String Payment(ModelMap map){
		map.addAttribute("userlistobj",Utils.getalluser());
		return "payment";
		
	}
@RequestMapping(value="payment", method=RequestMethod.POST)
public String AddPayment(@ModelAttribute("account") Account a){
	service.SavePayment(a);
	return "Dashboard";
	
}
@RequestMapping("details")
public String Alldetails(ModelMap map){
	List<Account> list=service.getalldetails();
	map.addAttribute("payerinfo",list);
	return "allpaymentdetails";
	
}

/*@RequestMapping("receive")
public String Receipet(){
	
	return "receipet";
	
}
@RequestMapping("allpaymentdetails")
public String Alldetails(ModelMap map){
	List<User> list=Utils.getalluserforaccount();
	map.addAttribute("payers",list);
	return "allpaymentdetails";
	
}

@RequestMapping("payment")
public String AddPayment(@ModelAttribute("Account") Account a){
	service.SavePayment(a);
	return "welcome";
	
}
@RequestMapping("receive")
public String AddReceipet(ModelMap map){
	
List<Account> a=service.getalldetails();
map.addAttribute("Account",a);
return "receipet";


}*/

}
