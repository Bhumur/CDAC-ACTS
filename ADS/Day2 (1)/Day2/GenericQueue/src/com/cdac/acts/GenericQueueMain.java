/*Q2. Implement a Generic Queue class using array that implements the Queue
interface defined in Q1.
Throw appropriate exception when required.
(Refer to class notes)*/

package com.cdac.acts;

import java.util.Scanner;

public class GenericQueueMain {

	public static <T> void main(String[] args) {
	
		Queue<Object> queue = new GenericQueue<Object>(10);
	
		try (Scanner sc=new Scanner(System.in)) {
		
		//int size=0;
		Integer ch;
		
		
		do {
			System.out.println("------------Menu------------");
			System.out.println(" 1. Enqueqe ");
			System.out.println(" 2. Dequeqe ");
			System.out.println(" 3. Exit ");
			
			System.out.println(" Enter your Choice : ");
			ch = sc.nextInt();
			switch(ch) {
			
				case 1:
				{
					System.out.println("Enter the Element to enqueqe : ");
					@SuppressWarnings("unchecked")
					T element = (T) sc.next();
					try {
						queue.enqueue(element);
					} catch (isFullException e) {
						e.printStackTrace();
					}

					break;
				}
				
				case 2:
				{
					try {
						System.out.println(" Removed Element : " + queue.dequeue());
					} catch (isEmptyException e) {
						e.printStackTrace();
					}
					break;
				}
				
				
				case 3:
				{
					System.exit(0);
				}
				}
		}while(ch!=3);
		
		sc.close();
		}
		

	}

}


/*------------Menu------------
 1. Enqueqe 
 2. Dequeqe 
 3. Exit 
 Enter your Choice : 
1
Enter the Element to enqueqe : 
5.2
------------Menu------------
 1. Enqueqe 
 2. Dequeqe 
 3. Exit 
 Enter your Choice : 
1
Enter the Element to enqueqe : 
6.3
------------Menu------------
 1. Enqueqe 
 2. Dequeqe 
 3. Exit 
 Enter your Choice : 
1
Enter the Element to enqueqe : 
10
------------Menu------------
 1. Enqueqe 
 2. Dequeqe 
 3. Exit 
 Enter your Choice : 
2
 Removed Element : 5.2
------------Menu------------
 1. Enqueqe 
 2. Dequeqe 
 3. Exit 
 Enter your Choice : 
1
Enter the Element to enqueqe : 
a
------------Menu------------
 1. Enqueqe 
 2. Dequeqe 
 3. Exit 
 Enter your Choice : 
2
 Removed Element : 6.3
------------Menu------------
 1. Enqueqe 
 2. Dequeqe 
 3. Exit 
 Enter your Choice : 
2
 Removed Element : 10
------------Menu------------
 1. Enqueqe 
 2. Dequeqe 
 3. Exit 
 Enter your Choice : 
2
 Removed Element : a
------------Menu------------
 1. Enqueqe 
 2. Dequeqe 
 3. Exit 
 Enter your Choice : 
2
com.cdac.acts.isEmptyException
	at com.cdac.acts.GenericQueue.dequeue(GenericQueue.java:32)
	at com.cdac.acts.GenericQueueMain.main(GenericQueueMain.java:44)
------------Menu------------
 1. Enqueqe 
 2. Dequeqe 
 3. Exit 
 Enter your Choice : 
3
*/
