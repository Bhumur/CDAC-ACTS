package com.cdac.acts.dataStructure.linkedlist;

import com.cdac.acts.exception.ListIsEmptyException;

public class SinglyList implements List {

	private SListNode head;
	private SListNode tail;
	
	public SinglyList() {
		this.head = null;
		this.tail = null;
	}
	@Override
	public void addAtFront(int ele) {
		SListNode newNode = new SListNode();
		newNode.data = ele;
		newNode.next = head;
		head = newNode;
		if(tail==null) {
			tail=head;
		}
		return ;		
	}

	@Override
	public void addAtRear(int ele) {
		SListNode newNode = new SListNode();
		newNode.data = ele;
		newNode.next = null;
		if(head==null) {
			head=newNode;
			tail=newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
		return;
	}

	@Override
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}

	@Override
	public int deleteFirstNode() throws ListIsEmptyException {
		if(head==null) {
			throw new ListIsEmptyException("LINKED LIST IS EMPTY");
		}
		int x = head.data;
		head = head.next;
		return x;
	}

	@Override
	public void print() {
		SListNode temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

}
