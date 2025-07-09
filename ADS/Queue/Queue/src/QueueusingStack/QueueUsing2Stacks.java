package QueueusingStack;

public class QueueUsing2Stacks implements QueueADT{

	int[] stack1, stack2;
	int top1, top2;
	int size;
	
	public QueueUsing2Stacks(int size) {
		this.size= size;
		stack1= new int[size];
		stack2= new int[size];
		top1=-1;
		top2=-1;
	}
	
	@Override
	public void enqueue(int data) {
		stack1[++top1] = data; // push into stack1
		
	}

	@Override
	public int dequeue() {
		if(top2 == -1) {
			if(top1 == -1) {
			System.out.println("Queue is Empty!!");
			return -1;
		}
			while(top1 != -1) {
				stack2[++top2] = stack1[top1--]; // move from Stack1 to stack2
			}
		}
		return stack2[top2--];
	}

	public boolean isEmpty() {
		return (top1 == -1 && top2== -1);
	}

	public void display() {
		for(int i= top2 ; i>=0; i--) {
			System.out.println(stack2[i]+ " ");
		}
		for(int i=0; i<=top1 ; i++) {
			System.out.println(stack1[i]+ " ");
		}
		System.out.println();
	}

}
