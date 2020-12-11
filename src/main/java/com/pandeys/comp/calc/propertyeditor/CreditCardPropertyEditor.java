package com.pandeys.comp.calc.propertyeditor;

import java.beans.PropertyEditorSupport;

import com.pandeys.comp.calc.api.CreditCardDto;

public class CreditCardPropertyEditor extends PropertyEditorSupport {

	@Override
	public String getAsText() {
		return "0000/0000/0000/0000";
	}

	@Override
	public Object getValue() {
		return super.getValue();
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		CreditCardDto cardDto = new CreditCardDto(0000, 0000, 0000, 0000);
		setValue(cardDto);
	}	
}
