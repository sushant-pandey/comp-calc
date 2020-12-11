package com.pandeys.comp.calc.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pandeys.comp.calc.api.NamesDTO;
import com.pandeys.comp.calc.service.CompatibilityLevelCalculator;

@Controller
public class AppController {
	
	@Autowired
	private CompatibilityLevelCalculator compCalc;
	
	@RequestMapping("/")
	public String getHome(Model model) {
		model.addAttribute("names", new NamesDTO());
		return "input-name";
	}
	
	@RequestMapping("/compResult")
	public String calculateCompatibility(Model model, @Valid NamesDTO namesDto, 
			BindingResult result, HttpSession session) {
		model.addAttribute("names", namesDto);
		model.addAttribute(BindingResult.MODEL_KEY_PREFIX + "names", result);
		if(result.hasErrors()) {
			return "input-name";
		}
				
		String compResult = compCalc.getCompatibilityLevel(namesDto.getName1(), namesDto.getName2());
		namesDto.setCompatibilityResult(compResult);
		session.setAttribute("names", namesDto);
		return "comp-result";
	}
}
