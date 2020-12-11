package com.pandeys.comp.calc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.pandeys.comp.calc.api.PhoneNumber;

public class PhoneNumberFormatter implements Formatter<PhoneNumber> {

	@Override
	public String print(PhoneNumber phoneNumber, Locale locale) {
		return phoneNumber.getCountryCode() + "-" + phoneNumber.getPhoneNumber();
	}

	@Override
	public PhoneNumber parse(String phoneNumberText, Locale locale) throws ParseException {
		PhoneNumber phoneNumber = null;
		
		if (!phoneNumberText.isEmpty()) {
			phoneNumber = new PhoneNumber();
			if(phoneNumberText.contains("-")) {
				String[] number = phoneNumberText.split("-");			
				phoneNumber.setCountryCode("91");
				phoneNumber.setPhoneNumber(number[1]);
			} else {
				phoneNumber.setPhoneNumber(phoneNumberText);
			}			
		}
		return phoneNumber;
	}
}
