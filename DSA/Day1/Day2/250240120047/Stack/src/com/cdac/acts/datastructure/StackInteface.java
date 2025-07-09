package com.cdac.acts.datastructure;

import com.cdac.acts.exception.StackIsEmptyException;

public interface StackInteface<T> {
	public void push(T ele);
	public T pop() throws StackIsEmptyException;
	public T peek() throws StackIsEmptyException;
	public boolean isEmpty();
	public boolean isFull();
}
