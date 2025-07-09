
package ads;

import java.util.EmptyStackException;

@SuppressWarnings("unused")
public class ResizeableArrayStack implements Stack {

	@SuppressWarnings("unused")
	private String[] data;
	
	@SuppressWarnings("unused")
	private int top;
	
	//Constructor
	public ResizeableArrayStack() {
		data= new String[10];
		top=0;
	}
	
	@Override
	public void push(String item) throws StackFullException {

		if(top == data.length) {
			resize(2 * data.length); // resize if array is full
		}
		data[top++]= item;
	}

	private void resize(int newCapacity) {

		String[] newData= new String[newCapacity]; // creates array newData with new Capacity
		for (int i=0; i< top; i++) {
			newData[i] = data[i];
		}
		data= newData; // the original array data is discarded. data points to newData
	}

	@Override
	public String pop() throws StackEmptyException {
		
		if(isEmpty()) {
			throw new StackEmptyException("Stack is Empty!!!");
		}
		String value= data[--top];
		data[top]= null;
		return value;
	}

	@Override
	public String peek() throws StackEmptyException{
		
		if(isEmpty()) {
			throw new StackEmptyException("Stack is Empty!!");
		}
		return data[top-1];
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return top==0;
	}

	@Override
	public int size() {
		return top	;
	}

	
}
