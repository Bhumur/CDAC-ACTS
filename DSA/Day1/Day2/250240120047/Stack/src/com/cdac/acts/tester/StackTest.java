package com.cdac.acts.tester;

import java.util.Scanner;

import com.cdac.acts.datastructure.Stack;
import com.cdac.acts.exception.StackIsEmptyException;


public class StackTest {

	public static void main(String[] args) throws StackIsEmptyException {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter The size of stack : ");
			int n = sc.nextInt();
			Stack<Integer> stack = new Stack<>(n);
			int op;
			do {
				System.out.println("\n\nOPTIONS:-");
				System.out.println("1. push Element in Stack.");
				System.out.println("2. pop from Stack.");
				System.out.println("3. peek from Stack.");
				System.out.println("4. isEmpty Stack.");
				System.out.println("5. isFull Stack.");
				System.out.println("6. Display full stack.");
				System.out.println("0. Exit");
				System.out.print("\n\nEnter your choice : ");
				op = sc.nextInt();
				
				switch(op) {
					case 1: {
						System.out.println("1. push Element in Stack.");
						System.out.println("Enter Element : ");
						int x = sc.nextInt();
						stack.push(x);
						System.out.println("Sucessfully Pushed");
						break;
					}
					case 2: {
						System.out.println("2. pop from Stack.");
						System.out.println("Stack Poped Element : " + stack.pop());
						break;
					}
					case 3: {
						System.out.println("3. peek from Stack.");
						System.out.println("Stack Peeked Element : " + stack.peek());
						break;
					}
					case 4: {
						System.out.println("4. isEmpty Stack.");
						if(stack.isEmpty()) {
							System.out.println("Stack is Empty");
						}else {
							System.out.println("Stack is Not Empty");
						}
						break;
					}
					case 5: {
						System.out.println("5. isFull Stack.");
						if(stack.isFull()) {
							System.out.println("Stack is Full");
						}else {
							System.out.println("Stack is Not Full");
						}
						break;
					}
					case 6: {
						System.out.println("6. Display full stack.");
						stack.displayStack();
						break;
					}
					case 0: break;
					default: System.out.println("INVALID VALUE");
				}
			}while(op!=0);
		}
	}

}
