package com.cdac.acts.Interface;

import com.cdac.acts.exception.ElementNotFoundException;
import com.cdac.acts.exception.EmptyListException;

public interface SortedList {
	public void insert(int element);
	public void delete(int element) throws EmptyListException, ElementNotFoundException;
	public void deleteAll(int element) throws ElementNotFoundException;
	public void printForwards();
}
