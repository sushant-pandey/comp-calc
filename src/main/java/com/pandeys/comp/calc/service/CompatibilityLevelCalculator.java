package com.pandeys.comp.calc.service;

import org.springframework.stereotype.Service;

@Service
public class CompatibilityLevelCalculator {
	
	private final int FLAMES_LENGTH = 5;
	
	public String getCompatibilityLevel(String name1, String name2) {
		int totalLength = (name1 + name2).length();
		return CompatibilityLevel.values()[totalLength % FLAMES_LENGTH].toString();	
	}
}
