package com.cdac.acts.queue;

import com.cdac.acts.exception.QueueIsEmptyException;
import com.cdac.acts.exception.QueueIsFullException;

public interface Queue {
	public void enqueue(int ele) throws QueueIsFullException;
	public int dequeue() throws QueueIsEmptyException;
	public boolean isEmpty();
	public boolean isFull();
}
