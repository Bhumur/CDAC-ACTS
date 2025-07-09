package com.cdac.acts.tester;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> arr = new ArrayList<Double>(10);
		do {
			System.out.print("Enter "  + arr.size() + "th Double : ");
			double d = sc.nextDouble();
			arr.add(d);
		}while(arr.size()<10);
		
		System.out.println("_______________________Display All Elements in Array__________________");
		System.out.println("Display All Elements in Array : " + arr.toString());
		
		System.out.println("_______________________indexOf(element)__________________");
		System.out.print("Enter Number for which you want to get index : ");
		double d = sc.nextDouble();
		System.out.println("Index of " + d + " is : " + arr.indexOf(d));
		
		System.out.println("_______________________lastIndexOf(element)__________________");
		System.out.print("Enter Number for which you want to get Last Index : ");
		d = sc.nextDouble();
		System.out.println("Last Index of " + d + " is : " + arr.lastIndexOf(d));
		
		sc.close();
	}

}
