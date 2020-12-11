package com.pandeys.comp.calc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, Object>{
	
	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		return true;
	}

}
