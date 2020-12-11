package com.pandeys.comp.calc.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionThrowingController {
	
	@RequestMapping("/testNPException")
	public String getExceptionPage() {
		if(1==1)
			throw new NullPointerException();
		return "non-exception-page";
	}
	
	@RequestMapping("/testIOException")
	public String getIOExceptionPage() throws IOException {
		if(1==1)
			throw new IOException();
		return "non-exception-page";
	}
	
	@RequestMapping("/testGenericException")
	public String getGenericExceptionPage() throws Exception {
		if(1==1)
			throw new Exception();
		return "non-exception-page";
	}
}
