package com.pandeys.comp.calc.controller;

import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pandeys.comp.calc.api.CommunicationDTO;
import com.pandeys.comp.calc.api.PhoneNumber;
import com.pandeys.comp.calc.api.RegistrationDto;
import com.pandeys.comp.calc.propertyeditor.NamePropertyEditor;
import com.pandeys.comp.calc.validator.EmailValidator;
import com.pandeys.comp.calc.validator.UserNameValidator;

@Controller
public class RegistrationController {
	
	@RequestMapping("/registration")
	public String getUserRegistration(@ModelAttribute("registration") RegistrationDto regDto) {
		//Setting default values
		regDto.setName("James Bond");
		regDto.setUserName("james_bond");
		regDto.setPassword(new char[]{'0', '0','7','0','0','7'});
		regDto.setCountryName("UK");
		regDto.setHobbies(new String[] {"movies", "reading"});
		regDto.setGender("male");
		regDto.setAge(45);
		regDto.setCommunicationDto(new CommunicationDTO("jamesbond@bond.com", new PhoneNumber("044", "1122334455")));
		regDto.setName("James Bond");
		return "user-registration";
	}
	
	@RequestMapping("/registrationSuccess")
	public String getRegistrationSuccess(@Valid @ModelAttribute("registration") RegistrationDto regDto, BindingResult result) {
		EmailValidator eValid = new EmailValidator();
		eValid.validate(regDto, result);
		if(result.hasErrors()) {
			System.out.println(result);
			return "user-registration";
		}
		return "registration-success";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor trimEdit = new StringTrimmerEditor(false);
		binder.registerCustomEditor(String.class, "name", trimEdit);
		
		NamePropertyEditor nameEdit = new NamePropertyEditor();
		binder.registerCustomEditor(String.class, "name", nameEdit);
		
		binder.addValidators(new UserNameValidator()/*
													 * , new EmailValidator()
													 */);
	}
}
