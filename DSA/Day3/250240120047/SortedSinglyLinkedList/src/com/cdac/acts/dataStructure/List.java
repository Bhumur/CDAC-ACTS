package com.cdac.acts.dataStructure;

import com.cdac.acts.exception.ElementNotFoundException;
import com.cdac.acts.exception.EmptyLinkedListException;

public interface List {
	void add(int element);
	void delete(int element) throws ElementNotFoundException, EmptyLinkedListException;
	void deleteAll(int element);
	boolean search(int element);
	void print();
}
