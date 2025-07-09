package ads;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		    Node head = null;
		    DoublyLinkedList dl = new DoublyLinkedList();

		    head = dl.insertAtFront(head, 10);       // [10]
		    head = dl.insertAtEnd(head, 40);         // [10, 40]
		    head = dl.insertAtPosition(head, 2, 20); // [10, 20, 40]

		    System.out.println("DLL iterative approach!!");
		    dl.ForwardTraversal(head);

		    System.out.println("DLL recursive approach!");
		    dl.forwardtraversalr(head);

		    // Set tail
		    Node tail = head;
		    while (tail != null && tail.next != null) {
		        tail = tail.next;
		    }

		    System.out.println("For backward traversal");
		    dl.backwardtraversal(tail);
		    dl.backwardtraversalr(tail);

		    System.out.println("Iterative size: " + dl.findSize(head));
		    System.out.println("Recursive size: " + dl.findsize(head));

		    head = dl.deletehead(head); // Deletes 10
		    head = dl.deleteLast(head); // Deletes 40
		    head = dl.DeleteAtSpecificPosition(head, 2); // Deletes node at position 2 (which may not exist now)

		    System.out.println("After Deletions:");
		    dl.ForwardTraversal(head);
		    dl.forwardtraversalr(head);
		}

}
