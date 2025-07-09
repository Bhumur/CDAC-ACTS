package QueueusingStack;

public class Main {

	public static void main(String[] args) {
		
		QueueUsing2Stacks q= new QueueUsing2Stacks(10);
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.display();
		
		q.dequeue();
		q.display();
		q.display();
	}
}
