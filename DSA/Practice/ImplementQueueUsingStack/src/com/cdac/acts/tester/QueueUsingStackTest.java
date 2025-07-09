package com.cdac.acts.tester;

import java.util.Scanner;

import com.cdac.acts.exception.QueueIsEmptyException;
import com.cdac.acts.exception.QueueIsFullException;
import com.cdac.acts.queue.QueueUsingStack;

public class QueueUsingStackTest {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print(" Enter Size Queue : ");
			int size  = sc.nextInt();
			 QueueUsingStack queue = new  QueueUsingStack(size);
			int op;
			do {
				System.out.println("OPTIONS:-");
				System.out.println("1. Enqueue to Queue.");
				System.out.println("2. Dequeue to Queue.");
				System.out.println("3. IsFull.");
				System.out.println("4. IsEmpty.");
				System.out.println("0. Exit.");
				System.out.print("\n\nEnter your choice : ");
				op = sc.nextInt();
				
				switch(op) {
					case 1: {
						System.out.println("1. Enqueue to Queue.");
						System.out.print("Enter Element : ");
						int x = sc.nextInt();
						try {
							queue.enqueue(x);
						}catch (QueueIsFullException e) {
							System.out.println(e.getMessage());
						}
						break;
					}
					case 2: {
						System.out.println("2. Dequeue to Queue.");
						try {
							System.out.println(queue.dequeue()); 
						}catch (QueueIsEmptyException e) {
							System.out.println(e.getMessage());
						}
						break;
					}
					case 3: {
						System.out.println("3. IsFull.");
						if(queue.isFull()) {
							System.out.println("QUEUE is Full");
						}else {
							System.out.println("QUEUE is not Full");
						}
						break;
					}
					case 4: {
						System.out.println("4. IsEmpty.");
						if(queue.isEmpty()) {
							System.out.println("QUEUE is Empty");
						}else {
							System.out.println("QUEUE is not Empty");
						}
						break;
					}
					case 5: break;
					default: System.out.println("INVALID INPUT");
				}
			}while(op!=0);
		} 

	}

}
