package com.cdac.acts.exception;

@SuppressWarnings("serial")
public class DuplicateBookException extends Exception{
	public DuplicateBookException(String str) {
		super(str);
	}
}
