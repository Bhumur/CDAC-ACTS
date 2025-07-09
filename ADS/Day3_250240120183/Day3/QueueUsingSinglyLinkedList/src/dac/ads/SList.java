package dac.ads;

public interface SList {
	void addAtFront(int element);
	void addAtRear(int element);
	int deleteFirstNode();
	boolean isEmpty() throws isEmptyException;
	void print();
	
}
