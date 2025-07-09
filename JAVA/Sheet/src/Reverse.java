package com.cdac.acts.tester;
import java.util.Scanner;
import java.lang.StringBuffer;
class Reverse{
	public static void main(String []agr){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String : ");
		String s = sc.nextLine();
		System.out.print("=========By own Method==========");
		char []c = s.toCharArray();
		for(int i=0,j=c.length-1;i<j;i++,j--){
			char t = c[i];
			c[i] = c[j];
			c[j] = t;
		}
		
		s = new String(c);
		System.out.println(s);
		
		System.out.print("=========Use String Class==========");
		
		s = new StringBuffer(s).reverse().toString();
		System.out.println(s);
		
	}
}