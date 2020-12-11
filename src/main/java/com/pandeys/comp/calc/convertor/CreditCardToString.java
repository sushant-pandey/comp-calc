package com.pandeys.comp.calc.convertor;

import org.springframework.core.convert.converter.Converter;

import com.pandeys.comp.calc.api.CreditCardDto;

public class CreditCardToString implements Converter<CreditCardDto, String>{

	@Override
	public String convert(CreditCardDto source) {
		return "ABCD-EFGH-IJKL-MNOP";
	}

}
