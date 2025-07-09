package dac.ads;

public class SortedDLL implements List {

	DNode head;
	DNode tail;

	public SortedDLL() {
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
	public void insert(int element) {

		DNode newNode = new DNode(element);
		newNode.next = newNode.previous = null;

		if(isEmpty()) {
			head = newNode;
			tail = newNode;
			return;
		}

		//traversing

		DNode current = head;
		while(current != null) {
			if(current.data > element) {
				break;
			}
			current = current.next;
		}
		// adding before 1st node

		if(current == head) {
			head.previous = newNode;
			newNode.next = head;
			head = newNode;
			return;
		}

		//adding after last node

		if(current == null) {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			return;
		}

		//insert between current and current node's previous node

		newNode.next = current;
		newNode.previous = current.previous;
		current.previous.next = newNode;
		current.previous = newNode;

	}

	@Override
	public void delete(int element) {
		DNode current = head;
		if(isEmpty()) {
			return;
		}

		//list is empty

		while(current != null) {
			if(current.data == element) {
				break;
			}
			current = current.next;
		}

		//delete first element

		if(current.previous == null) {
			current.next.previous = null;
			head =current.next;

			/*head = head.next;
			head.previous = null;*/
			return;
		}

		//delete last element

		if(current.next == null) {
			tail = current.previous;
			tail.next = null;
			return;
		}

		current.previous.next = current.next;
		current.next.previous = current.previous;

	}



	@Override
	public boolean search(int element) {
		DNode current = head;
		current = current.next;
		while(current != null) {
			if(current.data == element) {
				System.out.println("Element found " + element);
				return true;
			}
			else {
				System.out.println("Element not found " + element);
				return false;
			}

		}

		return false;
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


	@Override
	public void deleteAll(int element) {
		
		DNode current = head;
		
		if(isEmpty()) {
			return;
		}
		
		while(current != null) {
			if(current.data == element) {
				
				//1st 
				if(current.previous == null) {
					head = head.next;
					head.previous=null;
					
					current = current.next;

				}else
				//last 
				if(current.next == null) {
					current.previous.next = null;
					tail = current.previous;
					

							
					
					return;
				}
				
				else {
				//middle
				
				current.previous.next = current.next;
				current.next.previous = current.previous;
				current = current.next;

				}
				
				
			}
			else {
				current = current.next;
			}
			//current = current.next;	
		}
	}

}
