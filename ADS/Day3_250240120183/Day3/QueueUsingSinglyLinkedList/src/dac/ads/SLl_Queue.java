package dac.ads;

public class SLl_Queue extends SinglyLinkedList implements Queue {

	@Override
	public void enqueue(int element) {
		
		addAtRear(element);

	}

	@Override
	public int dequeue() throws isEmptyException{
		
		
		return deleteFirstNode();
	}

	@Override
	public boolean isEmpty() {
		
		try {
			super.isEmpty();
		} catch (isEmptyException e) {
			System.out.println("Queue is Empty!!!");
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public void print() {
		super.print();
	}
	
}
