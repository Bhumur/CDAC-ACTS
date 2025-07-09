package com.cdac.acts.exception;

@SuppressWarnings("serial")
public class AccountNotFoundException extends Exception {
	public AccountNotFoundException(String str) {
		super(str);
	}
}
