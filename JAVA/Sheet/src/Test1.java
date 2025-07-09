package com.cdac.acts.tester;

import java.util.Scanner;
import com.cdac.acts.functions.strings.UpperLower;
public class Test1{
	public static void main(String []agrs){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A String : ");
		String s = sc.nextLine();
		
		
		System.out.println("---------------------USING STRING CLASS FUNCTIONS-------------------");
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println("---------------------USING OUR FUNCTIONS-------------------");
		System.out.println(UpperLower.Low(s));
		System.out.println(UpperLower.Up(s));
	}
}