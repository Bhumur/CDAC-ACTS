package Stackop;

public class StackOperation {

	private int[] stack;//array of intergers
	private int top;
	private int capacity;
	
	public StackOperation(int size) {
		capacity=size;
		stack=new int[capacity];
		top=-1;
	}
	
	public void push(int data) {
		if(top==capacity-1) {
			System.out.println("Stack overflow cannot push!!"+ data);
			return ;
		}
		stack[+top]=data;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow!! Cannot pop");
			return -1;
		}
		return stack[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty nothinfg to peek");
			return -1;
		}
		return stack[top];
	}
	
	
	public boolean isEmpty() {
		return top== -1;
	}
	
	public void printStack() {
		for(int i=top ;i>=0; i--) {
			System.out.println();
		}
	}
	public static void main(String[] args) {

	}

}
