package com.pandeys.comp.calc.api;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.Set;

public class BillDTO {
	private BigDecimal amount;
	private Currency currency;
	private Date date;
	private CreditCardDto creditCard;
	private Set<Currency> currencyOptions;
	
	public BigDecimal getAmount() {
		currency.getAvailableCurrencies();
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public CreditCardDto getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(CreditCardDto creditCard) {
		this.creditCard = creditCard;
	}
	
	public Set<Currency> getCurrencyOptions() {
		return Currency.getAvailableCurrencies();
	}
	public void setCurrencyOptions(Set<Currency> currencyOptions) {
		this.currencyOptions = Currency.getAvailableCurrencies();
	}
	@Override
	public String toString() {
		return "BillDTO [amount=" + amount + ", currency=" + currency + ", date=" + date + ", creditCard=" + creditCard
				+ "]";
	}
}
