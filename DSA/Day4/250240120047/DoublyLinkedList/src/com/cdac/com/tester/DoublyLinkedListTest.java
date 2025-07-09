package com.cdac.com.tester;

import com.cdac.com.dataStructure.DoublyLinkedList;
import com.cdac.com.exception.DoublyLinkedListEmptyException;

public class DoublyLinkedListTest {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.addAtFornt(1);
		list.addAtRear(2);
		list.addAtFornt(3);
		list.addAtRear(4);
		System.out.print("Print : " );
		list.print();
		System.out.print("\n\nPrintBackward : " );
		list.printBackward();
		
		try {
			list.deleteAtFront();
		} catch (DoublyLinkedListEmptyException e) {
			e.printStackTrace();
		}
		System.out.print("\n\nPrint : " );
		list.print();
		try {
			list.deleteAtRear();
		} catch (DoublyLinkedListEmptyException e) {
			e.printStackTrace();
		}
		System.out.print("\n\nPrint : " );
		list.print();
		
		try {
			list.deleteAtRear();
		} catch (DoublyLinkedListEmptyException e) {
			e.printStackTrace();
		}
		try {
			list.deleteAtRear();
		} catch (DoublyLinkedListEmptyException e) {
			e.printStackTrace();
		}
		try {
			list.deleteAtRear();
		} catch (DoublyLinkedListEmptyException e) {
			e.printStackTrace();
		}
	}

}
