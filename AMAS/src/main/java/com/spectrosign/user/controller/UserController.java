package com.spectrosign.user.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spectrosign.user.model.User;
import com.spectrosign.user.service.IuserService;
@Controller
public class UserController {
	@Autowired
private IuserService serv;
/*	@RequestMapping(value="getlogin")
	public ModelAndView getlogin(){
		
		return new ModelAndView("login", "user", new User());
		
	}*/
	
	/*@RequestMapping(value="login",method=RequestMethod.POST)
public ModelAndView welcomepage( @ModelAttribute("user") User usr){
		
		boolean b=serv.check(usr);
		if(b)

			return new ModelAndView("welcome");
		else
			return new ModelAndView("failure");	
	}*/
	
		
@RequestMapping(value="newuser")
	public ModelAndView adduser(@ModelAttribute("user") User u,ModelMap map){
	
	return new ModelAndView("adduser");


	}
@RequestMapping(value="user")
public ModelAndView getuser(ModelMap map){
	List<User> alluser=serv.getuser();
	map.addAttribute("user",alluser);

return new ModelAndView("alluser");


}
@RequestMapping(value="submit" ,method=RequestMethod.POST)
public ModelAndView submit(@Valid @ModelAttribute("user") User us,BindingResult br){
	if(br.hasErrors()){
		
		return new ModelAndView("adduser");
		
	}
	else{
		if(us.getBlocks()<us.getFlats()){
			serv.saveUser(us);
		}
		else{
			  throw new IllegalArgumentException("blocks should be less than flats");
		}

	return new ModelAndView("Dashboard");

	}
}
@RequestMapping("delete")
public String deleteuse(@RequestParam("id") int id){
	serv.deleteuse(id);
	
	return "redirect:user.form";
	
}
@RequestMapping("edit")
public String getLocationById(@RequestParam("id")int id ,ModelMap map){
	
	User user=serv.getLocationById(id);
	map.addAttribute("user" ,user);
	return "edit";

	
	
}
@RequestMapping
public String update(@ModelAttribute("user") User user){
	serv.update(user);
	return "redirect:user.form";
}
@RequestMapping("/download")
public String exportDataToPdf(ModelMap map){
   map.addAttribute("user",serv.getuser());
	return "p";
}

}
