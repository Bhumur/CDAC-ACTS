package com.cdac.acts.dataStructure;

import com.cdac.acts.exception.DoublyLinkedListEmptyException;
import com.cdac.acts.exception.NoSuchElementFoundException;

public interface SortedList {
	public void add(int element);
	public void delete(int element) throws DoublyLinkedListEmptyException, NoSuchElementFoundException;
	public void deleteAll(int element) throws NoSuchElementFoundException;
	public boolean search(int element);
	public void print();
}
