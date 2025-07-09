package com.cdac.acts.tester;
import java.util.Scanner;
import com.cdac.acts.functions.numbers.Divisibility;

public class Test6{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		String s = sc.next();
		System.out.println(s+" is Divisible by 2 : "+Divisibility.div2(s));
		System.out.println(s+" is Divisible by 3 : "+Divisibility.div3(s));
		System.out.println(s+" is Divisible by 4 : "+Divisibility.div4(s));
		System.out.println(s+" is Divisible by 5 : "+Divisibility.div5(s));
		System.out.println(s+" is Divisible by 6 : "+Divisibility.div6(s));
		System.out.println(s+" is Divisible by 9 : "+Divisibility.div9(s));
		System.out.println(s+" is Divisible by 25 : "+Divisibility.div25(s));
	}
}
