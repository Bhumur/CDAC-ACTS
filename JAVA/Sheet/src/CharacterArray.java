package com.cdac.acts.tester;
import java.util.Scanner;
class CharacterArray{
	public static void main(String []agr){
		System.out.print("Enter A String : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char []c = s.toCharArray();
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
	}
}