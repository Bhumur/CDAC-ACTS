package com.cdac.acts.enums;

public enum AccountTypeEnum {
	S("Saving"),
	C("Current"),
	FD("FixDeposite");
	
	private String str;
	
	private AccountTypeEnum(String str) {
		this.str = str;
	}
	
	public String getValue() {
		return str;
	}
}
