package com.cdac.acts.stack;

import com.cdac.acts.exception.StackIsEmptyException;

public class Stack {
	private int[] stackData;
	private int top;
	
	public Stack(int n) {
		this.stackData = new int[n];
		this.top = -1;
	}

	public void push(int ele) {
		if(isFull()) {
			int[] x = new int[stackData.length * 2];
			for(int i=0;i<stackData.length;i++) {
				x[i] = stackData[i];
			}
			stackData = x;
		}
		top++;
		stackData[top] = ele;
	}

	public int pop() throws StackIsEmptyException{
		if(isEmpty()) {
			throw new StackIsEmptyException("Stack is Empty");
		}
		return stackData[top--];
	}

	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if(top==stackData.length-1) {
			return true;
		}
		return false;
	}

	public int peek() throws StackIsEmptyException{
		if(isEmpty()) {
			throw new StackIsEmptyException("Stack is Empty");
		}
		return stackData[top];
	}
	
	public int sizeOfStack() {
		return stackData.length;
	}
	
	public void displayStack() {
		for(int i =0;i<=top;i++) {
			System.out.print(stackData[i] + " ");
		}
	}
}
