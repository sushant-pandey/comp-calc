package com.pandeys.comp.calc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pandeys.comp.calc.api.RegistrationDto;

public class EmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return RegistrationDto.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		//Check the email field for empty or whitespace
		//read the message from message.properties
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDto.email", "communicationdto.email.empty");
		
		String email = ((RegistrationDto)target).getCommunicationDto().getEmail();
		if(!email.endsWith("bond.com")) {
			errors.rejectValue("communicationDto.email", "communicationdto.email.incorrect.domain");
		}
	}

}
