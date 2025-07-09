package dac.ads;

public interface List {
	void addAtFront(int element);
	void addAtLast(int element);
	int deleteFromFirst();
	int deleteFromLast();
	boolean isEmpty();
	void insert(int element);
	void delete(int element);
	void deleteAll(int element);
	boolean search(int element);
	void printForward();
	void printBackward();
}
