package dac.ads;

public class DLL implements List {

	DNode head;
	DNode tail;
	
	public DLL() {
		head = tail = null;
	}
	
	
	@Override
	public void addAtFront(int element) {
		
		DNode newNode = new DNode(element);
		
		if(isEmpty()) {
			tail = newNode;
		}
		else {
			head.previous = newNode;
		}
		
		newNode.next = head;
		head = newNode;
		
		return;
		
	}

	@Override
	public void addAtLast(int element) {

		DNode newNode= new DNode(element);
		
		if(isEmpty()) {
			head=newNode;
			tail=newNode;
		} 
		else {
			tail.next=newNode;
		}
		newNode.previous=tail;
		tail=newNode;
		return;

	}

	@Override
	public int deleteFromFirst() {

		//DNode newNode= new DNode();
		
		if(isEmpty()) {
			
			return 0;
		}
		head=head.next;
		if(isEmpty()) {
			head = tail = null;
			System.out.println(" Nothing to Delete");
		}
		else {
		
			head.previous=null;
		}
		return 0;
	}

	@Override
	public int deleteFromLast() {
		
		if(isEmpty()) {
			return 0;
		}
		
		tail=tail.previous;
		if(isEmpty()) {
			tail=head=null;
			System.out.println(" Nothing to Delete");
		}
		else {
			tail.next=null;
		}
		return 0;
	}



	@Override
	public boolean isEmpty() {
		
		if(head == null) {
			return true;
		}
		
		return false;
	}


	@Override
	public void printForward() {
		
		DNode current = head;
		
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
		
	}


	@Override
	public void printBackward() {
		
		DNode current = tail;
		
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.previous;
		}
		System.out.println(" ");
		
	}

}
