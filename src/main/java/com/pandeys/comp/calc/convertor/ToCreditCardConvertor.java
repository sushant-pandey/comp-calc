package com.pandeys.comp.calc.convertor;

import org.springframework.core.convert.converter.Converter;

import com.pandeys.comp.calc.api.CreditCardDto;

public class ToCreditCardConvertor implements Converter<String, CreditCardDto>{

	@Override
	public CreditCardDto convert(String source) {
		return new CreditCardDto(9999, 9999, 9999, 9999);
	}

}
