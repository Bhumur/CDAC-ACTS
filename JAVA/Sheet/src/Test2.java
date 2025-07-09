package com.cdac.acts.tester;
import com.cdac.acts.functions.strings.NamePrint;
import java.util.Scanner;

public class Test2{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name : ");
		String first = sc.next();
		System.out.print("Enter Last Name : ");
		String last = sc.next();
		System.out.print(NamePrint.Name(first,last));
	}
}