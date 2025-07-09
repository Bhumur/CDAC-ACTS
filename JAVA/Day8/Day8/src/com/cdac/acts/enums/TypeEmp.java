package com.cdac.acts.enums;

public enum TypeEmp {
	PE("Permanent Employee"),
	CE("Contract Employee");
	
	private String str;
	
	private TypeEmp(String str) {
		this.str = str;
	}
	
	public String getValue() {
		return str;
	}
}
