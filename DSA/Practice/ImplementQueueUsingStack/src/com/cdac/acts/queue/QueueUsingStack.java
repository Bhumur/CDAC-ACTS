package com.cdac.acts.queue;

import com.cdac.acts.exception.QueueIsEmptyException;
import com.cdac.acts.exception.QueueIsFullException;
import com.cdac.acts.exception.StackIsEmptyException;
import com.cdac.acts.stack.Stack;

public class QueueUsingStack implements Queue{
	private Stack s1;
	private Stack s2;
	
	
	public QueueUsingStack(int n) {
		this.s1 = new Stack(n);
		this.s2 = new Stack(n);
	}


	@Override
	public void enqueue(int ele) throws QueueIsFullException {
		if(isFull()) {
			throw new QueueIsFullException("Queue is Full");
		}
		s1.push(ele);
	}


	@Override
	public int dequeue() throws QueueIsEmptyException {
		if(isEmpty()) {
			throw new QueueIsEmptyException("Queue is Empty");
		}
		while(!s1.isEmpty()) {
			try {
				s2.push(s1.pop());
			} catch (StackIsEmptyException e) {
				e.printStackTrace();
			}
		}
		int result = 0;
		try {
			result = s2.pop();
		} catch (StackIsEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(!s2.isEmpty()) {
			try {
				s1.push(s2.pop());
			} catch (StackIsEmptyException e) {
				e.printStackTrace();
			}
		}
		return result;
	}


	@Override
	public boolean isEmpty() {
		if(s1.isEmpty()) {
			return true;
		}
		return false;
	}


	@Override
	public boolean isFull() {
		if(s1.isFull()) {
			return true;
		}
		return false;
	}
	
	
}
