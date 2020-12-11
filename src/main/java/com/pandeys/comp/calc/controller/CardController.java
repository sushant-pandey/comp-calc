package com.pandeys.comp.calc.controller;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Currency;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pandeys.comp.calc.api.BillDTO;
import com.pandeys.comp.calc.api.CreditCardDto;
import com.pandeys.comp.calc.formatter.CreditCardFormatter;
import com.pandeys.comp.calc.propertyeditor.CreditCardPropertyEditor;
import com.pandeys.comp.calc.propertyeditor.NamePropertyEditor;

@Controller
public class CardController {

	@RequestMapping("/card")
	public String getCardDetails(@ModelAttribute("billInfo") BillDTO billDto, BindingResult result) {
		billDto.setAmount(new BigDecimal(123456));
		billDto.setCurrency(Currency.getInstance("USD"));
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		billDto.setDate(new java.util.Date());
		CreditCardDto cardDto = new CreditCardDto();
		billDto.setCreditCard(cardDto);
		return "card-input";
	}
	
	@RequestMapping("/carddisplay")
	public String publishCardDetails(@Valid @ModelAttribute("billInfo") BillDTO billDto, BindingResult result) {
		return "card-display";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor cstDtEdit = new CustomDateEditor(dateFormat, true);
		binder.registerCustomEditor(Date.class, "date", cstDtEdit);
		
		NumberFormat numFormat = new DecimalFormat("###,###.00");
		CustomNumberEditor amtEditor = new CustomNumberEditor(BigDecimal.class, numFormat, true);
		binder.registerCustomEditor(BigDecimal.class, "amount", amtEditor);
		
//		binder.addCustomFormatter(new CreditCardFormatter());
		
//		CreditCardPropertyEditor cardEditor = new CreditCardPropertyEditor();
//		binder.registerCustomEditor(CreditCardDto.class, "creditCard", cardEditor);
	}
}
