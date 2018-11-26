package com.spectrosign.user.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.spectrosign.user.model.IdUpload;
import com.spectrosign.user.service.Ifileservice;
import com.spectrosign.util.Userutil;


@Controller
public class FileUploadController {
	@Autowired
	private Ifileservice service;
	@Autowired
	private Userutil us;

	private MultipartFile fObj;
	
	@RequestMapping("upload")
	public String getupload(ModelMap map){
		map.addAttribute("user",us.getalluser());
		return "photo";
		
	}
	@RequestMapping(value="photoupload" ,method=RequestMethod.POST)
	public String doFileUpload(@ModelAttribute("idUpload") IdUpload id){ 
		byte[] b=id.getFiledata();
		
		if(b!=null)
			id.setFiledata(b);
			
		service.save(id);

		return "Dashboard";
	
	}
	@RequestMapping("show")
	public String showimage(@ModelAttribute("idUpload") IdUpload user, ModelMap map){
		List<IdUpload> list=service.getFiles(user);
		map.addAttribute("im" ,list);
		return "displayimage";
		
	}
	
}

