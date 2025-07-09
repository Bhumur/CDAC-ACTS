package com.cdac.acts.tester;

import com.cdac.acts.dataStructure.SortedDoublyLinkedList;
import com.cdac.acts.exception.DoublyLinkedListEmptyException;
import com.cdac.acts.exception.NoSuchElementFoundException;

public class SortedDoublyLLTest {

	public static void main(String[] args) throws DoublyLinkedListEmptyException, NoSuchElementFoundException {
		SortedDoublyLinkedList list = new SortedDoublyLinkedList();
		list.add(0);
		list.delete(0);
		list.print();
		list.add(1);
		list.print();
		list.add(11);
		list.print();
		list.add(11);
		list.add(11);
		list.add(11);	
		list.add(7);
		list.add(-1);
		list.print();
		list.deleteAll(11);
		System.out.println("wd");
		list.print();
		System.out.println("wd");
		//list.delete(0);
	}

}
