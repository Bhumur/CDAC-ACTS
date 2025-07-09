package com.cdac.acts.tester;
import java.util.Scanner;
class compareTo{
	public static void main(String []agr){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 1st String : ");
		String s1 = sc.next();
		System.out.print("Enter 2nd String : ");
		String s2 = sc.next();
		
		System.out.println("----------------Case Sensetive -----------------------");
		if(s1.compareTo(s2)>0){
			System.out.println(s1+" is greater than "+s2+" Lexographically");
		}
		else{
			System.out.println(s2+" is greater than "+s1+" Lexographically");
		}
		
		System.out.println("----------------not Case Sensetive -----------------------");
		
		if(s1.compareToIgnoreCase(s2)>0){
			System.out.println(s1+" is greater than "+s2+" Lexographically");
		}
		else{
			System.out.println(s2+" is greater than "+s1+" Lexographically");
		}
	}
}