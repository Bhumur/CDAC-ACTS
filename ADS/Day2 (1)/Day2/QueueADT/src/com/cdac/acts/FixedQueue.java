package com.cdac.acts;

public class FixedQueue implements Queue{

	private Integer [] queueData;
	Integer front;
	Integer rear;
	
	public FixedQueue(Integer n) {
		queueData = new Integer[n];
		front = -1;
		rear = -1;
	}
	
	@Override
	public void enqueue(Integer element)  throws QueueIsFullException{
		
		try {
			if(isFull()) {
				throw new QueueIsFullException(" Queue is Full ");
			}
			
			++rear;
			queueData[rear] = element;
			
		} catch (QueueIsFullException e) {
			e.printStackTrace();
		}
		
		
	}


	@Override
	public Integer dequeue()  throws QueueIsEmptyException{
		if(isEmpty()) {
			throw new QueueIsEmptyException(" Queue is Empty ");
		}
		
		++front;
		
		return queueData[front];
	}

	@Override
	public boolean isFull(){
		if(rear == queueData.length-1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty(){
		
		if(front == rear) {
			return true;
		}
		
		return false;
	}

	

}

