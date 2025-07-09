package com.cdac.acts.tester;

import java.util.Scanner;

public class ReverseStringTest {

	public static String Reverse(String s) {
		String ans = "";
		for(int i=s.length()-1;i>=0;i--) {
			ans += s.charAt(i);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The String Want to Reverse : ");
		String s = sc.nextLine();
		System.out.println("Reversed String is : " + Reverse(s));
		sc.close();
	}

}
