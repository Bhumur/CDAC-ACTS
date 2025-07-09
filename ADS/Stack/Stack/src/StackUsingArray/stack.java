


package StackUsingArray;

public class stack implements stackarray {

	@SuppressWarnings("unused")
	private int maxsize;
	
	@SuppressWarnings("unused")
	private int[] stackarray;
	
	private int top;
	
	public stack(int size) {
		maxsize=size;
		stackarray= new int[maxsize]; //allocation of memory
		top=-1;
	}

	@Override
	public boolean isEmpty() {
		return (top == -1);
	}

	@Override
	public boolean isFull() {
		return (top == maxsize-1);
	}

	@Override
	public void push(int value) {

		if(isFull()) {
			System.out.println("Stack is Full!! Cannot push");
		} else {
			stackarray[++top]= value;
			System.out.println("Pushed!!"+ value);
		}
	}

	@Override
	public void pop() {

		if(isEmpty()) {
			System.out.println("Stack is Empty!! Cannot pop");
		} else {
			System.out.println(stackarray[top--]);
		}
	}

	@Override
	public void peek() {

		if(isEmpty()) {
			System.out.println("Stack is Empty!!");
		} else {
			System.out.println("Top Element is: " + stackarray[top]);
		}
	}

	@Override
	public void display() {
		
		if(isEmpty()) {
			System.out.println("Stack is Empty!! Cannot Display Values");
		} else {
			for(int i=top ; i>=0 ;i--) // // Print stack elements from top to bottom
			//for(int i=0; i<=top;i++ )
			{
				System.out.println(stackarray[i]);
			}
		}
}
}
