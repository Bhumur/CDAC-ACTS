package com.cdac.acts.dataStructure;

import com.cdac.acts.exception.DoublyLinkedListEmptyException;
import com.cdac.acts.exception.NoSuchElementFoundException;

public class SortedDoublyLinkedList implements SortedList {
	
	DLNode head;
	DLNode tail;
	
	public SortedDoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	@Override
	public void add(int element) {
		DLNode newNode = new DLNode();
		newNode.data = element;
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		if(head.data>=newNode.data) {
			newNode.next = head;
			newNode.pre = null;
			head.pre = newNode;
			head = newNode;
			return;
		}
		if(tail.data<=newNode.data) {
			newNode.pre=tail;
			newNode.next=null;
			tail.next=newNode;
			tail = newNode;
			return;
		}
		DLNode curr = head;
		while(curr!=null) {
			if(curr.data>newNode.data) {
				break;
			}
			curr = curr.next;
		}
		newNode.next = curr;
		newNode.pre = curr.pre;
		curr.pre = newNode;
		newNode.pre.next = newNode;
	}

	@Override
	public void delete(int element) throws DoublyLinkedListEmptyException, NoSuchElementFoundException {
		if(head == null) {
			throw new DoublyLinkedListEmptyException("LIST IS EMPTY");
		}
		if(head==tail && head.data==element) {
			head=null;
			tail=null;
			return;
		}
		DLNode curr = head;
		while(curr!=null) {
			if(curr.data==element) {
				break;
			}
			curr = curr.next;
		}
		if(curr==null) {
			throw new NoSuchElementFoundException("Element Not Found");
		}
		if(curr==head) {
			curr.next.pre=null;
			head = head.next;
			curr.next = null;
			return;
		}
		if(curr==tail) {
			tail = tail.pre;
			tail.next = null;
			curr.pre = null;
			return;
		}
		curr.pre.next = curr.next;
		curr.next.pre = curr.pre;
	}
		

	@Override
	public void deleteAll(int element) throws NoSuchElementFoundException {
		DLNode curr = head;
		int f =0 ;
		while(curr!=null) {
			if(curr.data==element) {
				DLNode temp = curr;
				curr = curr.next;
				f=1;
				if(head==tail && head.data==element) {
					head=null;
					tail=null;
					return;
				}
				if(temp==head) {
					temp.next.pre=null;
					head = head.next;
					temp.next = null;
					continue;
				}
				if(temp==tail) {
					tail = tail.pre;
					tail.next = null;
					temp.pre = null;
					continue;
				}
				temp.pre.next = temp.next;
				temp.next.pre = temp.pre;
			}
			else {
				curr = curr.next;
			}
		}
		if(curr==null && f==0) {
			throw new NoSuchElementFoundException("Element Not Found");
		}
		
	}

	@Override
	public boolean search(int element) {
		DLNode curr = head;
		while(curr!=null) {
			if(curr.data==element) {
				return true;
			}
			curr = curr.next;
		}
		return false;
	}

	@Override
	public void print() {
		DLNode temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		
	}

}
