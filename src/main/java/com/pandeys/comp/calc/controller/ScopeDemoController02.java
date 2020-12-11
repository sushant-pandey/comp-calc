package com.pandeys.comp.calc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class ScopeDemoController02 {
	
	@RequestMapping("/fourth")
	public String getFirstPage(Model model04, HttpServletRequest request) {
		HttpSession session = request.getSession();
		String demoName01 = (String) session.getAttribute("glob-demoName01");
		String demoName02 = (String) session.getAttribute("glob-demoName02");
		model04.addAttribute("demoName01", demoName01);
		model04.addAttribute("demoName02", demoName02);
		session.invalidate();
		return "scope-demo";
	}	
}
