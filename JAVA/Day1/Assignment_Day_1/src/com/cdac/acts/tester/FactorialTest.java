package com.cdac.acts.tester;
import java.util.Scanner;
import com.cdac.acts.fun.Factorial;

public class FactorialTest{
	public static void main(String[] args){
		System.out.print("Enter A Number of Which Factorial to be found : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Factorial of "+n+" is "+Factorial.fact(n));
		return;
	}
}