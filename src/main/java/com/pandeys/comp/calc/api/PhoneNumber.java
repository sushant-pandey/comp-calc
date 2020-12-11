package com.pandeys.comp.calc.api;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class PhoneNumber {
	
	private String countryCode;
	private String phoneNumber;
	
	public PhoneNumber() {
	}
	
	public PhoneNumber(String countryCode, String phoneNumber) {
		this.countryCode = countryCode;
		this.phoneNumber = phoneNumber;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return countryCode + "-" + phoneNumber ;
	}
}
