package com.cdac.acts.DataStructure;

import com.cdac.acts.exception.QueueIsEmptyException;
import com.cdac.acts.exception.QueueIsFullException;

public interface QueueGeneric<T> {
	public void enqueue(T ele) throws QueueIsFullException;
	public T dequeue() throws QueueIsEmptyException;
	public boolean isEmpty();
	public boolean isFull();
}
