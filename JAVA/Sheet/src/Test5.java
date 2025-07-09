package com.cdac.acts.tester;
import java.util.Scanner;
import com.cdac.acts.functions.numbers.NumberToWord;

public class Test5{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		String s = sc.next();
		System.out.println(NumberToWord.numtoword(s));
	}
}