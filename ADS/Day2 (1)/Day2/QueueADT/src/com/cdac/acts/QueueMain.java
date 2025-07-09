/*Q1. Define Queue as ADT (Refer to class notes).*/

package com.cdac.acts;

import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {
	
		Queue queue = new FixedQueue(10);
	
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
					Integer element = sc.nextInt();
					try {
						queue.enqueue(element);
					} catch (QueueIsFullException e) {
						e.printStackTrace();
					}

					break;
				}
				
				case 2:
				{
					try {
						System.out.println(" Removed Element : " + queue.dequeue());
					} catch (QueueIsEmptyException e) {
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
20
------------Menu------------
 1. Enqueqe 
 2. Dequeqe 
 3. Exit 
 Enter your Choice : 
1
Enter the Element to enqueqe : 
30
------------Menu------------
 1. Enqueqe 
 2. Dequeqe 
 3. Exit 
 Enter your Choice : 
1
Enter the Element to enqueqe : 
40
------------Menu------------
 1. Enqueqe 
 2. Dequeqe 
 3. Exit 
 Enter your Choice : 
2
 Removed Element : 20
------------Menu------------
 1. Enqueqe 
 2. Dequeqe 
 3. Exit 
 Enter your Choice : 
2
 Removed Element : 30
------------Menu------------
 1. Enqueqe 
 2. Dequeqe 
 3. Exit 
 Enter your Choice : 
2
 Removed Element : 40
------------Menu------------
 1. Enqueqe 
 2. Dequeqe 
 3. Exit 
 Enter your Choice : 
2
com.cdac.acts.QueueIsEmptyException
	at com.cdac.acts.FixedQueue.dequeue(FixedQueue.java:37)
	at com.cdac.acts.QueueMain.main(QueueMain.java:44)
------------Menu------------
 1. Enqueqe 
 2. Dequeqe 
 3. Exit 
 Enter your Choice : 
3
*/