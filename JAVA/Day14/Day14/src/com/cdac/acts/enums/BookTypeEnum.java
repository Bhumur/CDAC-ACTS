package com.cdac.acts.enums;

public enum BookTypeEnum {
	ACT("Action"),
	ADV("Advanture"),
	FIC("Fiction"),
	ROM("Romance"),
	HOR("Horror");
	
	private String str;
	
	private BookTypeEnum(String str) {
		this.str = str;
	}
	
	public String getValue() {
		return str;
	}
}
