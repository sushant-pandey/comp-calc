package com.pandeys.comp.calc.api;

public class NamesDTO {
	private String name1 = "Sheldon";
	private String name2 = "Amy";
	
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	@Override
	public String toString() {
		return "NamesDTO [name1=" + name1 + ", name2=" + name2 + "]";
	}
	
	
	
}
