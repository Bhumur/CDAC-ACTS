package com.cdac.acts.exception;

@SuppressWarnings("serial")
public class QueueIsFullException  extends Exception{
	public QueueIsFullException(String s){
		super(s);
	}
}
