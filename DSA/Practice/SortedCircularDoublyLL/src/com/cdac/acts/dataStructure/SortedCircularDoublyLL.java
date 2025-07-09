package com.cdac.acts.dataStructure;

import com.cdac.acts.Interface.SortedDoublyList;
import com.cdac.acts.exception.ElementNotFoundException;
import com.cdac.acts.exception.EmptyListException;

public class SortedCircularDoublyLL implements SortedDoublyList {
	
	DLNode head;
	
	public SortedCircularDoublyLL() {
		head = new DLNode();
		head.next = head;
		head.pre = head;
	}

	@Override
	public void insert(int element) {
		System.out.println("Inserting " + element);
		DLNode newNode = new DLNode();
		newNode.val = element;
		
		if(head.next==head) {
			head.next = newNode;
			head.pre = newNode;
			newNode.next = head;
			newNode.pre = head;
			return;
		}
		DLNode curr = head.next;
		while(curr!=head) {
			if(curr.val>newNode.val) {
				newNode.next = curr;
				newNode.pre = curr.pre;
				curr.pre.next = newNode;
				curr.pre = newNode;
				return;
			}
			else {
				curr = curr.next;
			}
		}
		
		newNode.pre = head.pre;
		newNode.next = head;
		head.pre.next = newNode;
		head.pre = newNode;
	}

	@Override
	public void delete(int element) throws EmptyListException, ElementNotFoundException {
		if(head.next==head) {
			throw new EmptyListException("List Is Empty");
		}
		if(head.next.val==element && head.next.next==head) {
			head.next = head;
			head.pre = head;
		}
		DLNode curr = head.next;
		while(curr!=head) {
			if(curr.val==element) {
				curr.pre.next = curr.next;
				curr.next.pre = curr.pre;
				return;
			}else {
				curr = curr.next;
			}
		}
		if(curr==head) {
			throw new ElementNotFoundException("Element Not Present in List");
		}
	}

	@Override
	public void deleteAll(int element) throws ElementNotFoundException {
		boolean flag = false;
		DLNode curr = head.next;
		while(curr!=head) {
			if(curr.val==element) {
				flag = true;
				if(curr.next==head && curr.pre==head) {
					head.next = head;
					head.pre = head;
					return;
				}
				curr.pre.next = curr.next;
				curr.next.pre = curr.pre;
			}
			curr = curr.next;
		}
		if(!flag) {
			throw new ElementNotFoundException("Element Not Present in List");
		}
	}

	@Override
	public void printForwards() {
		System.out.print("LIST : ");
		DLNode curr = head.next;
		while(curr!=head) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	@Override
	public void printBackwards() {
		System.out.print("LIST : ");
		DLNode curr = head.pre;
		while(curr!=head) {
			System.out.print(curr.val + " ");
			curr = curr.pre;
		}
		System.out.println();
		
	}

}
