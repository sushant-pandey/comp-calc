package com.pandeys.comp.calc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pandeys.comp.calc.api.RegistrationDto;

public class UserNameValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return RegistrationDto.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// Validation to check if the username has whitespaces or is empty
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "User Name Empty", "Username cannot be empty");
	
		//validation to check if the username has underscore
		if(!((RegistrationDto)target).getUserName().contains("_")){
			errors.rejectValue("userName", "Absent Underscore", "Username must contain an '_'");
		}
	}

}
