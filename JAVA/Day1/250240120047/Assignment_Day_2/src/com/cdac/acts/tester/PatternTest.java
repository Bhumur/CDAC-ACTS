package com.cdac.acts.tester;
import java.util.Scanner;
import com.cdac.acts.pattern.Pattern;
public class PatternTest{
	public static void main(String[] args){
		System.out.print("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println();
		Pattern.p1(n);
		System.out.println();
		Pattern.p2(n);
		System.out.println();
		Pattern.p3(n);
		System.out.println();
		Pattern.p4(n);
		return;
	}
}
		