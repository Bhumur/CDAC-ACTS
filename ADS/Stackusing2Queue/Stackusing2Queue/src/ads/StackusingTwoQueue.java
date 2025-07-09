package ads;

public class StackusingTwoQueue {

	int[] queue1, queue2;
	int front1, front2, rear1, rear2;
	int size;
	
	public StackusingTwoQueue(int size) {
		this.size = size;
		queue1 = new int[size];
		queue2 = new int[size];
		front1 = rear1 = -1; // main queue
		front2= rear2 = -1; // temporary queue
	}
	
	void push(int data) {
		if(rear1 == size-1) {
			System.out.println("Stack is full!!");
			return;
		}
		while(rear1 == size-1) {
			queue2[++rear2] = queue1[front1++]; // move from queue1 to queue2
		}
		queue1[++rear1] = data; // insert new Element
		
		while(rear2 != -1) {
			queue1[++rear1] = queue2[front2++]; // move elements back
		}
		front1= 0;
		front2= 0;
		rear2=-1;
	}
	
	int pop() {
		if(rear1 == -1) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return queue1[front1++];
	}
	
	void display() {
		for(int i= front1; i<= rear1 ; i++) {
			System.out.println(queue1[i]+ " ");
		}
		System.out.println(
				);
	}
	
	
}
