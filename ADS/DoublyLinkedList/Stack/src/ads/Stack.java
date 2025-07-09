package ads;

public interface Stack {

	void push(String item) throws StackFullException;
	String pop() throws StackEmptyException;
	String peek() throws StackEmptyException;
	boolean isFull();
	boolean isEmpty();
	int size();
}
