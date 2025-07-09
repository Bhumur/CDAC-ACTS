package dac.ads;

public interface Queue {

	void enqueue(int element);
	int dequeue() throws isEmptyException;
	boolean isEmpty();
	boolean isFull();
	void print();
}
