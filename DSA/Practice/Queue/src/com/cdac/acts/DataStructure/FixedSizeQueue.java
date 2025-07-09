package com.cdac.acts.DataStructure;

import com.cdac.acts.exception.QueueIsEmptyException;
import com.cdac.acts.exception.QueueIsFullException;

public class FixedSizeQueue implements Queue{
	private int[] dataQueue;
	private int front;
	private int rear;
	public FixedSizeQueue(int size) {
		this.dataQueue = new int[size];
		this.front = -1;
		this.rear = -1;
	}
	@Override
	public void enqueue(int ele) throws QueueIsFullException{
		if(isFull()) {
			throw new QueueIsFullException("QUEUE IS FULL");
		}
		rear++;
		dataQueue[rear] = ele;
	}
	@Override
	public int dequeue() throws QueueIsEmptyException{
		if(isEmpty()) {
			throw new QueueIsEmptyException("QUEUE IS EMPTY");
		}
		return dataQueue[++front];
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
		if(rear==dataQueue.length-1) {
			return true;
		}
		return false;
	}
}
