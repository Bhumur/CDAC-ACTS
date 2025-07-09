package dac.ads;

public class SLLMain {

	public static void main(String[] args) {

		System.out.println(" LinkedList ");
		SList sl=new SinglyLinkedList();
		
		sl.addAtFront(5);
		sl.addAtFront(10);
		sl.addAtFront(15);
		sl.print();
		
		sl.addAtRear(25);
		sl.addAtRear(30);
		sl.print();
		
		sl.deleteFirstNode();
		sl.print();
		
		System.out.println(" Queue using LinkedList ");
		Queue Sq =new SLl_Queue();
		
		Sq.enqueue(10);
		Sq.enqueue(20);
		Sq.enqueue(30);
		Sq.print();
		
		
		try {
			Sq.dequeue();
			Sq.print();
		} catch (isEmptyException e) {
			System.out.println("Queue is Empty!!!");
			e.printStackTrace();
		}
		
		
		try {
			Sq.dequeue();
			Sq.print();
		} catch (isEmptyException e) {
			System.out.println("Queue is Empty!!!!");
			e.printStackTrace();
		}
	}

}



/* LinkedList 
15 
10 
5 

15 
10 
5 
25 
30 

10 
5 
25 
30 

 Queue using LinkedList 
10 
20 
30 

20 
30 

30 
*/