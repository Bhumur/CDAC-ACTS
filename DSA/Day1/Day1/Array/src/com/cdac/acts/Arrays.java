package com.cdac.acts;

import java.util.Scanner;

public class Arrays {
	
	public static int deleteElement(int []arr, int logicalSize, int position) {
		for(int i=position+1;i<logicalSize;i++) {
			arr[i-1]=arr[i];
		}
		return --logicalSize;
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter Size of Array : ");
			int n = sc.nextInt();
			int logicalSize = 0;
			int []arr = new int[n];
			String s = "yes";
			while(s.equals("yes")) {
				System.out.print("Enter Array Element : ");
				arr[logicalSize] = sc.nextInt();
				logicalSize++;
				System.out.print("Want to enter more elements type yes : ");
				s = sc.next();
			}
			System.out.print("Enter position to delete : ");
			int a = sc.nextInt();
			
			logicalSize = deleteElement(arr,logicalSize,a);
			for(int i=0;i<logicalSize;i++) {
				System.out.print(arr[i] + " ");
			}
		}
		
	}

}
