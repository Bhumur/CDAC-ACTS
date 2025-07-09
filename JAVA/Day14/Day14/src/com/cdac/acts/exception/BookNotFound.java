package com.cdac.acts.exception;

@SuppressWarnings("serial")
public class BookNotFound extends Exception {
	public BookNotFound(String str) {
		super(str);
	}
}
