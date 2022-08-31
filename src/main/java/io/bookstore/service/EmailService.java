package io.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	@Autowired
	private JavaMailSender javaMailSender;
	
	public String sendEmail() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("prnvkatkar88@gmail.com");
		message.setTo("prnvkatkar88@gmail.com");
		message.setSubject("dummy subject");
		message.setText("dummy text");
		
		javaMailSender.send(message);
		
		return "mail sent";
	}
}
