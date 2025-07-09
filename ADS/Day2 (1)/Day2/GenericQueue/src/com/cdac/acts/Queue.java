package com.cdac.acts;

public interface Queue<T> {

	void enqueue(T element) throws isFullException;
	T dequeue() throws isEmptyException;
	boolean isFull();
	boolean isEmpty();
}
