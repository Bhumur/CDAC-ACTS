package StackusingLinkedList;


public class LinkedListStack {

	private node top;
	
	public LinkedListStack() {
		top= null;
	}
	
	public void push(int data) {
		node newnode= new node(data);
		
		newnode.next= top;
		top= newnode;
		System.out.println("Pushed:"+ data);
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack Underflow - Stack is empty");
		}
		return 0;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}
