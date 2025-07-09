package com.cdac.acts.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
	public static String ddmmyyyy = "dd/MM/yyyy";
	
	public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ddmmyyyy);
	
	public static LocalDate stringToDate(String strdate) {
		return LocalDate.parse(strdate,formatter);
	}
	
	public static String dateToString(LocalDate date) {
		return  date.format(formatter);
	}
}
