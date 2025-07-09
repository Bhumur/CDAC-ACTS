package com.cdac.acts.tester;
import com.cdac.acts.fun.Sortting;
import java.util.Scanner;

public class SorttingTest{
	public static void main(String[] args){
		System.out.print("Enter Size Of Array want to enter : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter The Array : ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		
		Sortting.sort(arr);
		
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
	}
}