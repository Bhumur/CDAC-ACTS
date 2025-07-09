package com.cdac.acts.tester;
import java.util.Scanner;

class Repeat{
	public static void main(String []agr){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String : ");
		String s = sc.nextLine();
		
		System.out.print("Enter Number of Repeation : ");
		int n = sc.nextInt();
		
		System.out.println("______________Our Function_____________________");
		for(int i=0;i<n;i++){
			System.out.print(s);
		}
		System.out.println("\n");
		System.out.println("______________Class Fucntion_____________________");
		
		System.out.println(s.repeat(n));
	}
}