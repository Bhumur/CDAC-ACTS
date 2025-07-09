package com.cdac.acts.enums;

public enum PrinterTypeEnum {
	
	LASER("Laser Printer"),
	INKJET("Ink Jet Printer"),
	DOTMATRIX("Dot Matrix");
	
	private String str;
	
	private PrinterTypeEnum(String str) {
		this.str = str;
	}
	
	public String getValue() {
		return str;
	}
	
}
