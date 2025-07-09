package com.cdac.acts.tester;

import com.cdac.acts.dataStructure.List;
import com.cdac.acts.dataStructure.SortedSinglyLinkedList;
import com.cdac.acts.exception.ElementNotFoundException;
import com.cdac.acts.exception.EmptyLinkedListException;

public class SortedSinglyLinkedListTest {

	public static void main(String[] args) throws ElementNotFoundException, EmptyLinkedListException {
		List list = new SortedSinglyLinkedList();
		
		list.add(10);
		list.add(11);
		list.add(7);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.deleteAll(0);
		System.out.println( list.search(7));
		list.print();

	}

}
