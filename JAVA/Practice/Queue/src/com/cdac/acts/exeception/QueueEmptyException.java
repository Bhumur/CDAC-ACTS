package com.cdac.acts.exeception;

@SuppressWarnings("serial")
public class QueueEmptyException extends Exception{

	public QueueEmptyException(String s) {
		super(s);
	}
}
