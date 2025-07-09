package ads;

public class queue {

	node front, rear;
	
	public queue() {
		this.front=null;
		this.rear=null;
	}
	
	void enqueue(int data) {
		node newNode= new node(data); // to push the data create newNode
		
		if(rear == null) {
			front = rear = newNode; // this will make the front and rear point to newNode if we don't do this front and rear will be null only
			return;
		}
		rear.next = newNode; //old rear node's next pointer is updated to point to newNode
		rear = newNode; // rear is move forward to newNode
	}
	
	void dequeue() {
		if(front == null) {
			System.out.println("Queue is Empty!!");
			return;
		}
		front = front.next;
		if(front == null) rear = null;
	}
	
	void display() {
		node temp = front;
		while(temp != null) {
			System.out.println(temp.data+ " ");
			temp= temp.next;
		}
		System.out.println();
	}
}
