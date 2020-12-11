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
@Constraint(validatedBy = { AgeValidator.class})
public @interface Age {
	int lower() default 18;
	
	int upper() default 60;
	
	String message() default "{validator.Age.agelimit}";
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
