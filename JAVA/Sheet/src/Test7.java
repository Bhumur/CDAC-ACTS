package com.cdac.acts.tester;
import java.util.Scanner;
import com.cdac.acts.functions.numbers.Sum;

public class Test7{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number : ");
		String s1 = sc.next();
		System.out.print("Enter 2nd Number : ");
		String s2 = sc.next();
		
		System.out.println(s1+" + "+s2+" is Equal to : "+Sum.sum(s1,s2));
	}
}
