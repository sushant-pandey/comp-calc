package com.pandeys.comp.calc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.pandeys.comp.calc.api.CreditCardDto;

public class CreditCardFormatter implements Formatter<CreditCardDto> {

	@Override
	public String print(CreditCardDto object, Locale locale) {
		object.setFirstFourDigits(1111);
		object.setSecondFourDigits(1111);
		object.setThirdFourDigits(1111);
		object.setFourthFourDigits(1111);
		return object.toString();
	}

	@Override
	public CreditCardDto parse(String cardNum, Locale locale) throws ParseException {
		
		CreditCardDto cardDto = new CreditCardDto();
		cardDto.setFirstFourDigits(1234);
		cardDto.setSecondFourDigits(4567);
		cardDto.setThirdFourDigits(1234);
		cardDto.setFourthFourDigits(4567);
		return cardDto;
	}

}
