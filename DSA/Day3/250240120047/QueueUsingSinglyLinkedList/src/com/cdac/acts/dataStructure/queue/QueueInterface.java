package com.cdac.acts.dataStructure.queue;

import com.cdac.acts.exception.ListIsEmptyException;
import com.cdac.acts.exception.QueueIsEmptyException;
import com.cdac.acts.exception.QueueIsFullException;

public interface QueueInterface {
	public void enqueue(int ele) throws QueueIsFullException;
	public int dequeue() throws QueueIsEmptyException, ListIsEmptyException;
	public boolean isEmpty();
	public boolean isFull();
}
