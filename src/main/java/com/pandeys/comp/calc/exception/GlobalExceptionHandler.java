package com.pandeys.comp.calc.exception;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.pandeys.comp.calc.controller.ExceptionThrowingController;

@ControllerAdvice(assignableTypes = ExceptionThrowingController.class)
public class GlobalExceptionHandler {

	@ExceptionHandler(value = NullPointerException.class)
	public String getNullPointerExceptionPage() {
		return "null-pointer-exception";
	}
	
	@ExceptionHandler(value = IOException.class)
	public String getIOExceptionPage() {
		return "io-exception-page";
	}
	
	@ExceptionHandler(value = Exception.class)
	public String getGenericExceptionPage() {
		return "generic-exception-page";
	}
}
