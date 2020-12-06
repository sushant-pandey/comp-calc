package com.pandeys.comp.calc.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pandeys.comp.calc.api.RegistrationDto;

@Controller
public class RegistrationController {
	
	@RequestMapping("/registration")
	public String getUserRegistration(@ModelAttribute("registration") RegistrationDto regDto) {
		return "user-registration";
	}
	
	@RequestMapping("/registrationSuccess")
	public String getRegistrationSuccess(@ModelAttribute("registration") RegistrationDto regDto) {
		return "registration-success";
	}
}
