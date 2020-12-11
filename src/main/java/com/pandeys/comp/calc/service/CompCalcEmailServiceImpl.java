package com.pandeys.comp.calc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service ("ccEmailService")
public class CompCalcEmailServiceImpl implements CompCalcEmailService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Override
	public void sendMail(String name1, String name2, String toEmailId, String result) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(toEmailId);
		mailMessage.setSubject("Compatibility Calculator results");
		mailMessage.setText("Hi " + name1 + ",\nThe compatibility app has calculated the "
				+ "result for compatibility with " + name2 +" as : " + result
				+ "\n Thanks,\nComp Calc Team");
		
		mailSender.send(mailMessage);
	}

}
