package com.cdac.acts;

public interface Queue {
	
	void enqueue(Integer element) throws QueueIsFullException;
	Integer dequeue() throws QueueIsEmptyException;
	boolean isFull();
	boolean isEmpty();
}
