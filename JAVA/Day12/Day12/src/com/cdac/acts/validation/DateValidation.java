package com.cdac.acts.validation;

import java.time.LocalDate;

public class DateValidation {
	public static LocalDate datevalid(LocalDate d) {
		if(d.isAfter(LocalDate.now())) {
			return null;
		}
		return d;
	}
}
