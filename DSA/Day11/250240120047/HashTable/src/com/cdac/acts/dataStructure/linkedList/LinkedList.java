package com.cdac.acts.dataStructure.linkedList;

public class LinkedList {
	LNode head;
	public LinkedList() {
		this.head = null;
	}
	
	public void addAtFront(int ele) {
		LNode newNode = new LNode(ele);
		if(this.head==null) {
			this.head = newNode;
			return;
		}
		newNode.next = this.head;
		this.head = newNode;
	}
	
	public boolean search(int ele) {
		LNode curr = head;
		while(curr!=null) {
			if(curr.val == ele) {
				return true;
			}
			curr = curr.next;
		}
		return false;
	}
	
	public void print() {
		LNode curr = head;
		while(curr!=null) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
		System.out.println();
	}
}
