package com.cdac.acts.exception;

@SuppressWarnings("serial")
public class QueueIsEmptyException extends Exception {
	public QueueIsEmptyException(String s) {
		super(s);
	}
}
