package com.cdac.acts.dataStructure;

import com.cdac.acts.exception.ElementNotFoundException;
import com.cdac.acts.exception.EmptyLinkedListException;

public class SortedSinglyLinkedList implements List {
	
	private SListNode head;
	//private SListNode tail;

	public SortedSinglyLinkedList() {
		this.head = null;
	}

	@Override
	public void add(int element) {
		SListNode newNode = new SListNode();
		newNode.data = element;
		if(head==null) {
			newNode.next = null;
			head = newNode;
			return;
		}
		if(head.data>newNode.data) {
			newNode.next = head;
			head = newNode;
			return;
		}
		SListNode temp = head;
		while(temp.next!=null) {
			if(temp.data<newNode.data) {
				break;
			}
			temp = temp.next;
		}
		if(temp.next==null) {
			temp.next = newNode;
			return;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}

	@Override
	public void delete(int element) throws ElementNotFoundException, EmptyLinkedListException {
		SListNode temp = head;
		SListNode pre = null;
		if(head==null) {
			throw new EmptyLinkedListException("No Element in List");
		}
		while(temp!=null && temp.data!=element) {
			pre = temp;
			temp = temp.next;
		}
		if(temp==null) {
			throw new ElementNotFoundException("Element not found");
		}
		if(temp.data == element) {
			head = head.next;
			return;
		}
		pre.next = temp.next;
		return;
	}

	@Override
	public void deleteAll(int element) {
		
		SListNode temp = head;
		SListNode pre = null;
		while(temp.data == element) {
			temp = temp.next;
			head = temp;
		}
		while(temp!=null) {
			if(temp.data == element) {
				pre.next = temp.next;
				temp = temp.next;
				continue;
			}
			pre = temp;
			temp = temp.next;
		}
		return ;
	}

	@Override
	public boolean search(int element) {
		SListNode temp = head;
		while(temp!=null) {
			if(temp.data == element) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void print() {
		SListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		return;
	}
	
	

}
