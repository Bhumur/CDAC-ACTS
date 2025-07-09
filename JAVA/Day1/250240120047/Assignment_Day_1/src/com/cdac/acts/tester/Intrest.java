package com.cdac.acts.tester;
import java.util.Scanner;
import java.lang.Math;
public class Intrest{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Principal Amount : ");
		double amount = sc.nextDouble();
		System.out.print("Enter time : ");
		int time = sc.nextInt();
		System.out.print("Enter rate : ");
		double rate = sc.nextDouble();
		
		System.out.println("CHOICE :- ");
		System.out.println("1. Simple Intrest");
		System.out.println("2. Compound Intrest");
		
		
		
		System.out.print("Enter option : ");
		int op = sc.nextInt();
		if(op==1)
		{
			double ans = amount*rate*time;
			System.out.println("Simple Intrest = "+ans);
		}
		else if(op==2)
		{
			double ans = amount*(Math.pow((1+rate/100),time));
			System.out.println("Simple Intrest = "+ans);
		}
		else{
			System.out.println("INVALID INPUT");
		}
	}
}