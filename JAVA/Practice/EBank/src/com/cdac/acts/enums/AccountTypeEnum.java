package com.cdac.acts.enums;

public enum AccountTypeEnum {
	SA("Saving Account"),
	CA("Current Account"),
	FD("Fixed Deposite");
	private String str;
	private AccountTypeEnum(String str) {
		this.str = str;
	}
	public String getValue() {
		return str;
	}
}
