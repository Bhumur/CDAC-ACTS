	package ads;
	
	public class SLL {
	
		Node head;
		
		//iterative approach for traverse
		public  void traverse(Node head) {
			
			while (head != null) {
				System.out.println(head.data + " ");
				head = head.next;
			}
			System.out.println();;
		}
		
		//recursive approach for traverse
		
		public void traverseList(Node head) {
			
			//Base condition when head is null
			if(head == null) {
				System.out.println();
				return;
			}
			
			System.out.println(head.data + " " );
			
			traverseList(head.next);
		}
		
		// iterative approach for search
		public boolean search(Node head, int key) {
			
			Node Current= head;
			while(Current != null) {
				
				if(Current.data == key) {
					return true;
				}
				Current = Current.next;
			}
			
			return false;	
		}
		
		// Recursive approach for search
		
		public boolean SearchNode(Node head, int key) {
			
			if(head == null) {
				return false;
			}
			
			if(head.data == key) 
				return true;
			
			return SearchNode(head.next, key);	
		}
		
		//Iterative approach for length of SLL
		
		public int CountNodes(Node head) {
			
			int count=0;
			Node current = head;
			
			while(current != null) {
				count++;
				current = current.next;
			}
			return count;		
		}
		
		public int NodeCount(Node head) {
			
			if(head == null) {
				return 0;
				}
			return 1 + NodeCount(head.next); // 1 + ensures that the current node is counted before moving to the next one.
			}
		
		// For addatFirst
		public static Node addatFirst(Node head, int newdata) {
		
			Node newNode = new Node(newdata);
			newNode.next = head;
			return newNode;	
		}
		
		//For addatLast
		public static Node addatLast(Node head, int newData) {
			Node newNode = new Node(newData);
			newNode.next=null;
		
			if(head == null) {
				return newNode;
			}
			
			Node temp= head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next= newNode;
			return head;	
		}
		
		@SuppressWarnings("unused")
		public static Node addatSpecifiedPosition(Node head, int data, int position) {
			
			if(position <1) {
				return head;
			}
			
			//same as insert as first
			if(position == 1) {
				Node newNode = new Node(data);
				newNode.next = head;
				return newNode;
			}
			
			// to insert at specific position we will have to traverse the list
			Node curr = head;
			 
			//Traverse to the node that will be  present just before the new node
			for(int i = 1; i < position - 1 && curr != null; i++) {
				 curr = curr.next;
				 
				 Node newNode = new Node(data); //create the newNode
				 newNode.next = curr.next; // Update the pointer
				 curr.next = newNode;
				 return head;
			 }
			return head;		
		}
		
		public static Node DeleteatFirst(Node head) {
			
			if(head == null) {
				return null;
			}
			
			@SuppressWarnings("unused")
			Node temp = head;
			
			head = head.next;
			return head;	
		}
		
		@SuppressWarnings("null")
		public static Node DeleteatLast(Node head) {
			
			if(head == null) {
				return null;
			}
			
			if(head.next == null) {
				return null;
			}
			
			Node SecondLast = head;
			while(SecondLast.next.next != null) {
				SecondLast= SecondLast.next;
			}
			
			SecondLast.next = null;
			return head;	
		}
		
		public static Node DeleteatSpecifiedPosition(Node head, int position) {
			Node temp = head;
			Node prev= null;
			
			//Base case when LL is empty
			if(temp == null) {
				return null;
			}
			
			//when position is head
			if(position == 1 ) {
				temp = head.next;
				return head;	
			}
			
			//Traverse the list
			for (int i =1; i <= position && temp != null; i++) {
				prev = temp; //initially prev is null now it is pointing to head in 1st iteration
				temp = temp.next;
			}
			if(temp != null) {
				prev.next= temp.next;
			} else {
				System.out.println("Data not present!!!");	
			}
			return head;
	}
		
		public static Node Reverse(Node head) {
			Node curr= head, prev=null, next = null;
			
			//traverse the list
			while(curr != null) {
				next= curr.next; // store next
				curr.next= prev;
				prev = curr; // Reverse current node's next pointer
				curr = next; // Move pointers one position ahead
			}
			return prev;
			}
	}
	
