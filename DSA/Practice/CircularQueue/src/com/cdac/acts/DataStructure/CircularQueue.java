package com.cdac.acts.DataStructure;

import com.cdac.acts.exception.QueueIsEmptyException;
import com.cdac.acts.exception.QueueIsFullException;

public class CircularQueue implements Queue {

	private int []queueData;
	private int front;
	private int rear;
	public CircularQueue(int size) {
		this.queueData = new int[size];
		this.front = 0;
		this.rear = 0;
	}
	@Override
	public void enqueue(int ele) throws QueueIsFullException {
		if(isFull()) {
			throw new QueueIsFullException("QUEUE IS FULL");
		}
		rear = (rear + 1)%queueData.length;
		queueData[rear] = ele;
	}

	@Override
	public int dequeue() throws QueueIsEmptyException {
		if(isEmpty()) {
			throw new QueueIsEmptyException("QUEUE IS EMPTY");
		}
		front = (front + 1)%queueData.length;
		return queueData[front];
	}

	@Override
	public boolean isEmpty() {
		if(front==rear) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(front == (rear+1)%queueData.length) {
			return true;
		}
		return false;
	}

}
