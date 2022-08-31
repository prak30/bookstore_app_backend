package io.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.bookstore.service.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService emailService;
	
	@GetMapping("/sendEmail")
	public String sendEmail() {
		return emailService.sendEmail();
		
	}

}
