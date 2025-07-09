package com.cdac.acts;

public class GenericQueue<T> implements Queue<T> {

	private T[] queueData;
	private Integer front;
	private Integer rear;
	
	@SuppressWarnings("unchecked")
	public GenericQueue(Integer n){
		queueData = (T[])new Object[n];
		front = -1;
		rear = -1;
	}
	
	@Override
	public void enqueue(T element) throws isFullException{
		
		if(isFull()) {
			throw new isFullException(" Queue is Full ");
		}
		
		++rear;
		
		queueData[rear] = (T) element; 
	}

	@Override
	public T dequeue() throws isEmptyException {
		
		if(isEmpty()) {
			throw new isEmptyException(" Queue is Empty ");
		}
		
		++front;
		
		return queueData[front];
	}

	@Override
	public boolean isFull() {
		if(rear == queueData.length-1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if(front == rear) {
			return true;
		}
		return false;
	}

}
