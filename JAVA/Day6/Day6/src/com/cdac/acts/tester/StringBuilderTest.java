package com.cdac.acts.tester;

import java.util.Scanner;

public class StringBuilderTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		StringBuilder str = new StringBuilder(s);
		
		System.out.println("------------------------str.charAt​(int index)----------------");
	
		System.out.println(str.charAt(0));
		
		
		
		System.out.println("------------------------str.append​(String str)----------------");
		
		
		System.out.println(str.append(str));
		
		
		
		
		System.out.println("------------------------str.	capacity()----------------");
		
		System.out.println(str.	capacity());
		
		
		
		
		
		
		System.out.println("------------------------str.indexOf(string)----------------");
		
		System.out.println(str.indexOf("umu"));
		
		
		
		
		
		
		System.out.println("------------------------str.insert(index, String str)----------------");
		System.out.println(str.insert(0,"Bhumur"));
		
		
		
		
		
		
		
		System.out.println("------------------------str.lastIndexOf​(String str)----------------");
		
		System.out.println(str.lastIndexOf("Bhumur"));
		
		
		
		System.out.println("------------------------str.substring​(int start, int end)----------------");
		
		
		System.out.println(str.substring(0, 6));
		
		
		System.out.println("------------------------str.length()----------------");
		System.out.println(str.length());
		
		
		System.out.println("------------------------str.reverse()----------------");
		System.out.println(str.reverse());
		
	
		
		sc.close();

	}

}
