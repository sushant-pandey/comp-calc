package com.pandeys.comp.calc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class NamesDTO {
	
	@Size(min = 3, max = 15, message = "* Name should be between 3-15 characters")
	@NotBlank(message = "* Name cannot be blank")
	private String name1;
	
	@Size(min = 3, max = 15, message = "* Name should be between 3-15 characters")
	@NotBlank(message = "* Name cannot be blank")
	private String name2;
	
	@AssertTrue(message = "You must agree to terms and Conditions")
	private Boolean acceptTermsAndConditions;
	
	private String compatibilityResult ;
	
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public Boolean getAcceptTermsAndConditions() {
		return acceptTermsAndConditions;
	}
	public void setAcceptTermsAndConditions(Boolean acceptTermsAndConditions) {
		this.acceptTermsAndConditions = acceptTermsAndConditions;
	}
	public String getCompatibilityResult() {
		return compatibilityResult;
	}
	public void setCompatibilityResult(String compatibilityResult) {
		this.compatibilityResult = compatibilityResult;
	}
	@Override
	public String toString() {
		return "NamesDTO [name1=" + name1 + ", name2=" + name2 + "]";
	}
	
	
	
}
