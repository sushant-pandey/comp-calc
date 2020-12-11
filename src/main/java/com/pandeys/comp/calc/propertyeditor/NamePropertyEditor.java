package com.pandeys.comp.calc.propertyeditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(text.toUpperCase());
	}

	@Override
	public void setValue(Object value) {
		super.setValue(value);
	}
}
