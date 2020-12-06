package com.pandeys.comp.calc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pandeys.comp.calc.api.NamesDTO;

@Controller
public class AppController {
	
	@RequestMapping("/")
	public String getHome(@ModelAttribute("names") NamesDTO namesDto) {
		return "input-name";
	}
	
	@RequestMapping("/compResult")
	public String calculateCompatibility(@ModelAttribute("names") NamesDTO namesDto) {
		return "comp-result";
	}
}
