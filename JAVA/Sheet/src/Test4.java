package com.cdac.acts.tester;
import java.util.Scanner;
import com.cdac.acts.functions.numbers.DigitSum;

public class Test4{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		String s = sc.next();
		System.out.println("Sum of Digits of "+s+" is : "+DigitSum.digitsum(s));
	}
}
