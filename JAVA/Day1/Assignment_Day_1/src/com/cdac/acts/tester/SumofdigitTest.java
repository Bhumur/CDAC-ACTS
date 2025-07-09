package com.cdac.acts.tester;
import com.cdac.acts.fun.SumOfDigits;
import java.util.Scanner;

public class SumofdigitTest{
	public static void main(String[] args){
			System.out.print("Enter A Number To Find Sum of Digits : ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			System.out.print("Sum of digits of "+n+" is "+SumOfDigits.sumofdigits(n));
			return;
	}
}