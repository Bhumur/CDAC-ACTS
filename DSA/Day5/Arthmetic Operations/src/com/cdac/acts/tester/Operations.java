package com.cdac.acts.tester;

import java.util.Scanner;

public class Operations {

	private static int divideQuotient(int a, int b) {
		if(a<b) {
			return 0;
		}
		else {
			return 1 + divideQuotient(a-b, b);
		}
	}
	
	public static int wapperDivideQuotient(int a, int b) {
		if(a==0) {
			return 0;
		}
		if(b==0) {
			throw new ArithmeticException("Divide by Zero");
		}
		if((a<0 && b>0) || (a>0 && b<0)) {
			return -1 * divideQuotient(Math.abs(a), Math.abs(b));
		}
		else{
			return divideQuotient(Math.abs(a), Math.abs(b));
		}
	}
	//////////////////////////////////////
	private static int divideReminder(int a, int b) {
		if(a<b) {
			return a;
		}
		else {
			return divideReminder(a-b, b);
		}
	}
	
	public static int wapperDivideReminder(int a, int b) {
		if(a==0) {
			return 0;
		}
		if(b==0) {
			throw new ArithmeticException("Divide by Zero");
		}
		if(a<0 && b>0){
			return -1 * divideReminder(Math.abs(a), Math.abs(b));
		}
		return divideReminder(Math.abs(a), Math.abs(b));
	}
	/////////////////////////////////////////
	private static int product(int a, int b) {
		if(b==0) {
			return 0;
		}
		if(b==1) {
			return a;
		}
		else {
			return a + product(a,b-1);
		}
	}
	
	public static int wapperMultiply(int a, int b) {
		if(a==0 || b==0) {
			return 0;
		}
		if((a<0 && b>0) || (a>0 && b<0)){
			a = Math.abs(a);
			b = Math.abs(b);
			return -1 * product(a>b?a:b, a>b?b:a);
		}
		a = Math.abs(a);
		b = Math.abs(b);
		return product(a>b?a:b, a>b?b:a);
	}
	
	public static void main(String[] args) {
		int op;
		try(Scanner sc = new Scanner(System.in)){
			do {
				System.out.println("\n\nOptions:- ");
				System.out.println("1. Find Quotient on Dividing two integer.");
				System.out.println("2. Find Reminder on Dividing two integer.");
				System.out.println("3. Find Product of two integer Optimally.");
				System.out.println("0. Exit");
				System.out.print("\n\nEnter your choice : ");
				
					op = sc.nextInt();
					switch(op) {
						case 1: {
							System.out.println("1. Find Quotient on Dividing two integer.");
							System.out.print("Enter two number whose quoitent want to find out : ");
							int a = sc.nextInt();
							int b = sc.nextInt();
							try {
								System.err.println("Quoitent of " + a + " and " + b + " is : " + wapperDivideQuotient(a, b));
							}catch (ArithmeticException e) {
								System.out.println(e.getMessage());
							}
							
							break;
						}
						case 2: {
							System.out.println("2. Find Reminder on Dividing two integer.");
							System.out.print("Enter two number whose reminder want to find out : ");
							int a = sc.nextInt();
							int b = sc.nextInt();
							try {
								System.err.println("Reminder of " + a + " and " + b + " is : " + wapperDivideReminder(a, b));
							}catch (ArithmeticException e) {
								System.out.println(e.getMessage());
							}
							
							break;
						}
						case 3: {
							System.out.println("3. Find Product of two integer Optimally.");
							System.out.print("Enter two number whose Multiply want to find out : ");
							int a = sc.nextInt();
							int b = sc.nextInt();
							System.err.println("Product of " + a + " and " + b + " is : " + wapperMultiply(a, b));
							break;
						}
						case 0: break;
						default: System.out.println("INVALID INPUT");
					}			
			}while(op!=0);
		}
	}

}
