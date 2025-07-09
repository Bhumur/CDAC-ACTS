package com.cdac.acts.dataStructure.queue;

import com.cdac.acts.dataStructure.linkedlist.SinglyList;
import com.cdac.acts.exception.ListIsEmptyException;
import com.cdac.acts.exception.QueueIsEmptyException;
import com.cdac.acts.exception.QueueIsFullException;

public class QueueUsingSinglyList extends SinglyList implements QueueInterface {
	
	@Override
	public void enqueue(int ele) throws QueueIsFullException {
		addAtRear(ele);
	}

	@Override
	public int dequeue() throws QueueIsEmptyException, ListIsEmptyException {
		return deleteFirstNode();
	}

	@Override
	public boolean isEmpty() {
		return super.isEmpty();
	}

	@Override
	public boolean isFull() {
		return false;
	}

}
