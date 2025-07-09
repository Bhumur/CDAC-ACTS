package ads;

public class DoublyLinkedList {

	//Iterative Approach
	public static void ForwardTraversal(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.println(curr.data+ " ");
			curr = curr.next;
		}
		System.out.println();
	}
	//Recursive approach
	public void forwardtraversalr(Node head) {
		if(head == null) {
			return;
		}
		System.out.println(head.data+ " ");
		forwardtraversalr(head.next);
	}
	
	//iterative approach for traversal
	public void backwardtraversal(Node tail) {
		Node curr= tail;
		while(curr != null) {
			System.out.println(curr.data+ " ");
			curr= curr.prev;
		}	
	}
	
	//recursive approach for traversal
	public void backwardtraversalr(Node node) {
		if(node == null)
			return;
		
		System.out.println(node.data+ " ");
		backwardtraversalr(node.prev);
	}
	
	//iterative approach for finding the size
	public int findSize(Node curr) {
		int size= 0;
		while(curr != null) {
			size++;
			curr = curr.next;
		}
		return size;	
	}
	
	//recursive approach for finding the size
	public int findsize(Node head) {
		if(head == null) {
			return 0;
		}
		
		return 1 + findsize(head.next);				
	}

	//method to insert at beginning of the DoublyLinkedList
	public static Node insertAtFront(Node head, int data) {
		Node newNode = new Node(data);
		
		newNode.next=head;
		
		if(head != null) {
			head.prev= newNode;
		}
		return newNode;	
	}
	
	//method to insert at end of the DoublyLinkedList
	public static Node insertAtEnd(Node head, int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			return newNode;
		}
			Node curr= head;
			while(curr.next!= null) {
				curr = curr.next;
			}
			curr.next= newNode;
			newNode.prev=curr;
		
		return head;		
	}
	
	public static Node insertAtPosition(Node head, int position, int data) {
		//create a newNode
		Node newNode = new Node(data);
		
		//insert at the beginning
		if(position == 1) {
			newNode.next=head;
			
			//if the LL is not empty,set the previous of head to newNode
			if(head != null) {
				head.prev = newNode;
				return newNode;
			}
		}
		
		Node curr = head;
		
		//traverse the list to find node before the insertion point
		for(int i =1; i< position-1 && curr!=null; i++) {
			curr= curr.next;
		}
		
		//if the position is out of bound
		if(curr == null) {
			System.out.println("Position is out of Bound");
			return head;
		}
				
		//set the next of newNode to next of current
		newNode.next = curr.next;
		
		//set the prev of newNode to curr
		newNode.prev = curr;
		
		//update the next of current node to new Node
		curr.next= newNode;
		
		//If the new Node is not the last node, update the prev next node to new node
		if(newNode.next!= null) {
			newNode.next.prev = newNode;
		}	
		return head;		
	}
	
	//method to delete at first Position
	public static Node deletehead(Node head) {
		//check if list is empty
		if(head == null) {
			return null;
		}
		head = head.next;
		if(head != null) {
			head.prev = null;
		}
		return head;		
	}
	
	//method to delete at end
	public static Node deleteLast(Node head) {
		
		//corner cases
		if(head == null) {
			return null;
		}
		
		if(head.next == null) {
			return null;
		}
		
		//traverse to last node
		Node curr= head;
		while(curr.next != null) {
			curr= curr.next;
		}
		
		//Update the previous node's next pointer
		if(curr.prev != null) {
			curr.prev.next= null;
		}
		return head;	
	}
	
	public static Node DeleteAtSpecificPosition(Node head, int position) {
		//corner cases
		if(head == null) {
			return null;
		}
		
		//traverse the list to find the node to be deleted
		Node curr = head;
		for(int i=1; curr != null && i< position; i++) {
			curr = curr.next;
		}
		
		//If the position is out of range
		if(curr == null) {
			return head;
		}
		
		//Update the previous node's next pointer
		if(curr.prev != null) {
			curr.prev.next = curr.next;
		}
		
		//update the next Node's prev pointer
		if(curr.next != null) {
			curr.next.prev = curr.prev;
		}
		
		//If the Node to be deleted is the head Node
		if(head == curr) {
			head= curr.next;
		}
		return head;		
	}
}
