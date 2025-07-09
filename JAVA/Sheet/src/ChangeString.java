package com.cdac.acts.tester;
import java.util.Scanner;

class ChangeString{
	public static void main(String []agr){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String : ");
		String s = sc.nextLine();
		
		char []c = s.toCharArray();
		
		for(int i=0;i<c.length;i++){
			c[i]=(char)(c[i]+1);
		}
		s = new String(c);
		
		System.out.print(s);
	}
}