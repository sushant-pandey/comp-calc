package com.pandeys.comp.calc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"demoName01", "demoName02"})
public class ScopeDemoController {
	
	@RequestMapping("/first")
	public String getFirstPage(Model model01, HttpServletRequest request) {
		HttpSession session = request.getSession();
		model01.addAttribute("demoName01", "DemoName01");
		model01.addAttribute("demoName02", "DemoName02");
		model01.addAttribute("nextLink", "second");
		session.setAttribute("glob-demoName01", "Global-DemoName01");
		session.setAttribute("glob-demoName02", "Global-DemoName02");
		return "scope-demo";
	}
	
	@RequestMapping("/second")
	public String getSecondPage(Model model02) {
		model02.addAttribute("nextLink", "third");
		return "scope-demo";
	}
	
	@RequestMapping("/third")
	public String getThirdPage(Model model03, SessionStatus status) {
		model03.addAttribute("nextLink", "fourth");
		status.setComplete();
		return "scope-demo";
	}
}
