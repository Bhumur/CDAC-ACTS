package com.cdac.acts.dataStructure.linkedlist;

import com.cdac.acts.exception.ListIsEmptyException;

public interface List {
	void addAtFront(int ele);
	void addAtRear(int ele);
	boolean isEmpty();
	int deleteFirstNode() throws ListIsEmptyException;
	void print();
}
