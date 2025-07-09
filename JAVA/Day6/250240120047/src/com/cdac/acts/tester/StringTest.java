package com.cdac.acts.tester;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.print("Enter String : ");
		str = sc.nextLine();
		
		System.out.println("------------------------str.charAt​(int index)----------------");
	
		System.out.println(str.charAt(0));
		
		
		
		System.out.println("------------------------str.concat​(String str)----------------");
		
		
		System.out.println(str.concat(str));
		
		
		
		
		System.out.println("------------------------str.compareTo​(String anotherString)----------------");
		
		System.out.println(str.compareTo("Bhumur"));
		
		
		
		
		
		
		System.out.println("------------------------str.compareToIgnoreCase​(String str)----------------");
		
		System.out.println(str.compareToIgnoreCase("bhumur"));
		
		
		
		
		
		
		System.out.println("------------------------str.indexOf(String str)----------------");
		System.out.println(str.indexOf("umu"));
		
		
		
		
		
		
		
		System.out.println("------------------------str.intern()----------------");
		
		str.intern();
		
		
		
		String s = "BhumurBhumur";
		
		
		
		
		
		
		
		System.out.println("------------------------str.equals()----------------");
		
		if(str.equals(s)) {
			System.out.println(str + " and " + s + " are have same content");
		}
		else {
			System.out.println(str + " and " + s + " are not have same content");
		}
		
		
		
		
		
		
		System.out.println("------------------------str.hashCode()----------------");
		System.out.println(str.hashCode());
		
		
		System.out.println("------------------------str.length()----------------");
		System.out.println(str.	length());
		
		
		System.out.println("------------------------str.matches​(String regex)----------------");
		System.out.println(str.matches("urBh"));
		
		
		System.out.println("------------------------str.toUpperCase()----------------");
		System.out.println(str.toUpperCase());
		
		
		sc.close();
		
		
	}

}
