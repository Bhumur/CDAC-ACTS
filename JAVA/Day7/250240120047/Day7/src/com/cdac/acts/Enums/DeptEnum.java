package com.cdac.acts.Enums;

public enum DeptEnum {
	SDE("Software Developer"),
	HR("Human Resource"),
	FI("Finance"),
	MK("Markiting");
	
	private String str;
	
	private DeptEnum(String str) {
		this.str = str;
	}
	
	public String getValue() {
		return str;
	}
}
