package com.cdac.acts.tester;

import com.cdac.acts.dataStructure.SortedCircularDoublyLL;
import com.cdac.acts.exception.ElementNotFoundException;
import com.cdac.acts.exception.EmptyListException;

public class SortedCircularDLLTest {

	public static void main(String[] args) throws EmptyListException, ElementNotFoundException {
		SortedCircularDoublyLL list = new SortedCircularDoublyLL();
		list.insert(0);
		list.insert(11);
		list.insert(-11);
		list.insert(-11);
		list.insert(-11);
		list.insert(-11);
		list.insert(-1);
		list.insert(1);
//		list.printForwards();
//		list.delete(11);
		list.printForwards();
		list.deleteAll(-11);
		list.deleteAll(-1);
//		list.printForwards();
//		list.delete(0);
		list.printForwards();
	}

}
