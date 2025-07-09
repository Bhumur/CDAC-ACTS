package com.cdac.acts.datastructure;

import com.cdac.acts.exception.StackIsEmptyException;

@SuppressWarnings("unchecked")
public class Stack<T> implements StackInteface<T>{
	private T[] stackData;
	private int top;
	
	public Stack(int n) {
		this.stackData = (T[]) new Object[n];
		this.top = -1;
	}

	@Override
	public void push(T ele) {
		if(isFull()) {
			T[] x = (T[]) new Object[stackData.length * 2];
			for(int i=0;i<stackData.length;i++) {
				x[i] = stackData[i];
			}
			stackData = x;
		}
		top++;
		stackData[top] = ele;
	}

	@Override
	public T pop() throws StackIsEmptyException{
		if(isEmpty()) {
			throw new StackIsEmptyException("Stack is Empty");
		}
		return stackData[top--];
	}

	@Override
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(top==stackData.length-1) {
			return true;
		}
		return false;
	}

	@Override
	public T peek() throws StackIsEmptyException{
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
