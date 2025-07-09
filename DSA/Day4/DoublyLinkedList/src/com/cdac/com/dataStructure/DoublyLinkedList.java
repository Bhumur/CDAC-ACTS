package com.cdac.com.dataStructure;

import com.cdac.com.exception.DoublyLinkedListEmptyException;

public class DoublyLinkedList implements DoubleList {
	
	private DLNode head;
	private DLNode tail;
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	@Override
	public void addAtFornt(int element) {
		DLNode newNode = new DLNode();
		newNode.data = element;
		newNode.pre = null;
		if(head == null ) {
			head = newNode;
			tail = newNode;
			newNode.next = null;
			return ;
		}
		newNode.next = head;
		head.pre = newNode;
		head = newNode;
		return;
	}

	@Override
	public void addAtRear(int element) {
		DLNode newNode = new DLNode();
		newNode.data = element;
		newNode.next = null;
		if(head == null ) {
			head = newNode;
			tail = newNode;
			newNode.pre = null;
			return ;
		}
		newNode.pre = tail;
		tail.next = newNode;
		tail = newNode;
		return;
	}

	@Override
	public int deleteAtFront() throws DoublyLinkedListEmptyException {
		if(head==null) {
			throw new DoublyLinkedListEmptyException("EMPTY DOUBLY LINKED LIST");
		}
		if(head.next==null) {
			DLNode temp = head;
			head=null;
			tail=null;
			return temp.data;
		}
		head.next.pre = null;
		DLNode temp = head;
		head = head.next;
		temp.next = null;
		return temp.data;
	}

	@Override
	public int deleteAtRear() throws DoublyLinkedListEmptyException {
		if(head==null) {
			throw new DoublyLinkedListEmptyException("EMPTY DOUBLY LINKED LIST");
		}
		if(head.next==null) {
			DLNode temp = tail;
			head=null;
			tail=null;
			return temp.data;
		}
		tail.pre.next = null;
		DLNode temp = tail;
		tail = tail.pre;
		temp.pre = null;
		return temp.data;
	}

	@Override
	public void print() {
		DLNode curr = head;
		while(curr!=null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	@Override
	public void printBackward() {
		DLNode curr = tail;
		while(curr!=null) {
			System.out.print(curr.data + " ");
			curr = curr.pre;
		}
		System.out.println();
	}

}
