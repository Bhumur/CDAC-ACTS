package com.cdac.acts.exception;

@SuppressWarnings("serial")
public class InvalidPhoneNumber extends Exception {
	public InvalidPhoneNumber(String str) {
		super(str);
	}
}