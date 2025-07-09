package com.cdac.com.dataStructure;

import com.cdac.com.exception.DoublyLinkedListEmptyException;

public interface List {
	public void addAtFornt(int element);
	public void addAtRear(int element);
	public int deleteAtFront() throws DoublyLinkedListEmptyException;
	public int deleteAtRear() throws DoublyLinkedListEmptyException;
	public void print();
}
