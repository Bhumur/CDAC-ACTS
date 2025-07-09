package com.cdac.acts.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
	public static String ddmmyyyy = "dd/MM/yyyy";
	
	public static LocalDate strToLocalDate(String s) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ddmmyyyy);
		return LocalDate.parse(s, formatter);
	}
	
	
	
	
}
