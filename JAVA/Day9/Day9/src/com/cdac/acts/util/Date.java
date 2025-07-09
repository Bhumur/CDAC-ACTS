package com.cdac.acts.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Date {
	public static String ddmmyyyy = "dd/MM/yyyy";
	
	public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ddmmyyyy);
	
	public static LocalDate stringToDate(String strdate) {
		return LocalDate.parse(strdate,formatter);
	}
	
	public static String dateToString(LocalDate date) {
		return  date.format(formatter);
	}
	
	public static long datediffinyear(LocalDate date1, LocalDate date2) {
		return ChronoUnit.YEARS.between(date1, date2);
	}
}
