package StackUsingArray;

import java.util.Scanner;

public class StackArrayMain {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Sizee of Stack:");
		 int size=sc.nextInt();
		 
		 
		 stack s= new stack(size);
		 
		 int choice;
		 
		 do {
			 System.out.println("-------Menu-----------");
			 System.out.println("1.Push");
			 System.out.println("2.Pop");
			 System.out.println("3.Peek");
			 System.out.println("4.Display");
			 System.out.println("5.Exit");
			 System.out.println("Enter your Choice");
			 choice= sc.nextInt();
			 
			 switch(choice) {
			 
			 case 1: 
			 {
				 System.out.println("Enter the value to Push");
				 int val = sc.nextInt();
				 
				 s.push(val);
				 break;
			 }
			 
			 case 2:
			 {
				 s.pop();
				 break;
			 }
			 
			 case 3:
			 {
				 s.peek();
				 break;
			 }
			 
			 case 4:
			 {
				 s.display();
				 break;
			 }
			 
			 case 5:
			 {
				 System.exit(0);
			 }
			 }

		 }while(choice!=5);
		 
		 
		 
		 
		 sc.close();
	}

}
