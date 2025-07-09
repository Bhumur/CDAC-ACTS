package dac.ads;

public class DNode {
	int data;
	DNode next;
	DNode previous;
	
	public DNode() {}

	public DNode(int data) {
		this.data = data;
		next = null;
		previous = null;
	}
}
