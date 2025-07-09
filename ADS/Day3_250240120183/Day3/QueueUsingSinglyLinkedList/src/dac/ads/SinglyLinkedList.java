package dac.ads;

public class SinglyLinkedList implements SList{

	private SNode head;
	private SNode tail;
	
	
	
	public SinglyLinkedList() {
		head = null;
		tail = null;
	}

	@Override
	public void addAtFront(int element) {
		SNode newNode = new SNode();
		newNode.data = element;
		newNode.next = head;
		head = newNode;
		
		if(tail == null) {
			tail = head;
		}
	}

	@Override
	public void addAtRear(int element) {
		SNode newNode = new SNode();
		newNode.data = element;
		newNode.next = null;
		
		try {
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else
			{
				tail.next=newNode;
				tail=newNode;
			
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}

	@Override
	public int deleteFirstNode() {
		SNode temp=head;
		try {
			if(head==null) {
				return 0;
			}
			else
				
			head=head.next;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return temp.data;
		
	}

	@Override
	public boolean isEmpty() throws isEmptyException{
		if(head==null) {
		return true;
		}
		return false;
	}

	@Override
	public void print() {
		
		SNode current=head;
		try {
			if(isEmpty()) {
				return ;
			}
		} catch (isEmptyException e) {
			e.printStackTrace();
		}
		
		while(current!=null) {
			System.out.println(current.data+" ");
			current=current.next;
		}
		System.out.println();
		
		
	}	
	
}
