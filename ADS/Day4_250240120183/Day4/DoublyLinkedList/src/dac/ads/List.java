package dac.ads;

public interface List {
	void addAtFront(int element);
	void addAtLast(int element);
	int deleteFromFirst();
	int deleteFromLast();
	boolean isEmpty();
	void printForward();
	void printBackward();
}
