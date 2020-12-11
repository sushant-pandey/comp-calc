package com.pandeys.comp.calc.validator;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PACKAGE;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target({ FIELD, METHOD, PARAMETER, CONSTRUCTOR, PACKAGE })
@Constraint(validatedBy = { PhoneNumberValidator.class})
public @interface PhoneNumber {

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
	String message () default "Invalid Phone Number \n Phone Number should be Country Code - 10 digit number ";
}
