package com.spectrosign.util;


import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;


@Component
public class Mailutil {
	@Autowired
private JavaMailSender sender;
	public void Sendmail(String toaddress,String subject,String message){
		MimeMessage msg=sender.createMimeMessage();
		MimeMessageHelper helper;
		try {
			helper = new MimeMessageHelper(msg,true);
			helper.setFrom("chinna2k16@gmail.com");
			helper.setTo(toaddress);
			helper.setText(message);
			helper.setSubject(subject);
			
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		sender.send(msg);
	

	}

	
}
