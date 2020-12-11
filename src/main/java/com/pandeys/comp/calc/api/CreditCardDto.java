package com.pandeys.comp.calc.api;

public class CreditCardDto {
	private int firstFourDigits;
	private int secondFourDigits;
	private int thirdFourDigits;
	private int fourthFourDigits;
	
	public CreditCardDto() {
	}
	
	public CreditCardDto(int firstFourDigits, int secondFourDigits, int thirdFourDigits, int fourthFourDigits) {
		super();
		this.firstFourDigits = firstFourDigits;
		this.secondFourDigits = secondFourDigits;
		this.thirdFourDigits = thirdFourDigits;
		this.fourthFourDigits = fourthFourDigits;
	}
	public int getFirstFourDigits() {
		return firstFourDigits;
	}
	public void setFirstFourDigits(int firstFourDigits) {
		this.firstFourDigits = firstFourDigits;
	}
	public int getSecondFourDigits() {
		return secondFourDigits;
	}
	public void setSecondFourDigits(int secondFourDigits) {
		this.secondFourDigits = secondFourDigits;
	}
	public int getThirdFourDigits() {
		return thirdFourDigits;
	}
	public void setThirdFourDigits(int thirdFourDigits) {
		this.thirdFourDigits = thirdFourDigits;
	}
	public int getFourthFourDigits() {
		return fourthFourDigits;
	}
	public void setFourthFourDigits(int fourthFourDigits) {
		this.fourthFourDigits = fourthFourDigits;
	}
	@Override
	public String toString() {
		return firstFourDigits + "-" + secondFourDigits
				+ "-" + thirdFourDigits + "-" + fourthFourDigits;
	}
	
	
}
