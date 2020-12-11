package com.pandeys.comp.calc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pandeys.comp.calc.api.EmailDTO;
import com.pandeys.comp.calc.api.NamesDTO;
import com.pandeys.comp.calc.service.CompCalcEmailService;
import com.pandeys.comp.calc.service.CompCalcEmailServiceImpl;

@Controller
public class EmailController {

	@Autowired
	private CompCalcEmailService ccEmailService;
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@ModelAttribute("emailDTO") EmailDTO emailDto) {
		return "send-email";
	}
	
	@RequestMapping("/emailSent")
	public String emailSent(@ModelAttribute("emailDTO") EmailDTO emailDto, HttpSession session) {
		String name1 = ((NamesDTO)session.getAttribute("names")).getName1();
		String name2 = ((NamesDTO)session.getAttribute("names")).getName2();
		String compatibilityResult = ((NamesDTO)session.getAttribute("names")).getCompatibilityResult();
		ccEmailService.sendMail(name1, name2, emailDto.getEmailAddress(), compatibilityResult);
		return "email-sent";
	}
}
