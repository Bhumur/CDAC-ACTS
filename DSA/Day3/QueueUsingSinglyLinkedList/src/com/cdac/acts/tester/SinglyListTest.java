package com.cdac.acts.tester;

import com.cdac.acts.dataStructure.linkedlist.List;
import com.cdac.acts.dataStructure.linkedlist.SinglyList;
import com.cdac.acts.exception.ListIsEmptyException;

public class SinglyListTest {

	public static void main(String[] args) {
		List list = new SinglyList();
		
		if(list.isEmpty()) {
			System.out.println("LIST IS EMPTY");
		}else {
			System.out.println("LIST IS NOT EMPTY");
		}
		list.addAtFront(10);
		list.addAtRear(11);
		list.addAtFront(12);
		list.addAtRear(13);
		list.addAtFront(14);
		try {
			list.deleteFirstNode();
		} catch (ListIsEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(list.isEmpty()) {
			System.out.println("LIST IS EMPTY");
		}else {
			System.out.println("LIST IS NOT EMPTY");
		}
		list.print();

	}

}
