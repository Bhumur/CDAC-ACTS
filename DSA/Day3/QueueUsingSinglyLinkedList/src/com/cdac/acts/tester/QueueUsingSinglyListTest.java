package com.cdac.acts.tester;

import com.cdac.acts.dataStructure.queue.QueueUsingSinglyList;
import com.cdac.acts.exception.ListIsEmptyException;
import com.cdac.acts.exception.QueueIsEmptyException;
import com.cdac.acts.exception.QueueIsFullException;

public class QueueUsingSinglyListTest {

	public static void main(String[] args) throws QueueIsEmptyException, ListIsEmptyException {
		QueueUsingSinglyList queue = new QueueUsingSinglyList();
		
		try {
			queue.enqueue(1);
			queue.enqueue(2);
			queue.enqueue(3);
			queue.enqueue(4);
			queue.enqueue(5);
			queue.dequeue();
			queue.enqueue(6);
		} catch (QueueIsFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		queue.print();
	}

}
