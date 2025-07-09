package com.cdac.acts.enums;

public enum DegreeEnum {
	BTECH("Bachlors of Technology"),
	MTECH("Masters of Technology"),
	MBBS("Bachlors of Doctor"),
	CA("Charter Accountant");

	private String str;
	
	private DegreeEnum(String string) {
		this.str = string;
	}
	
	public String getValue() {
		return str;
	}
}
