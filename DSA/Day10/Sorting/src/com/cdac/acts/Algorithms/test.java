package com.cdac.acts.Algorithms;

import java.util.Arrays;

public class test {
	
	public static void swap(int a, int b) {
		int t = a;
		a = b;
		b = t;
	}
	public static void main(String[] args) {
		String s = "jyotingai pratik bhumur mukul hemant shksdhnwkd ddwas";
		
//		int i=0;
//		while(i<s.length()) {
//			while(i<s.length() && s.charAt(i)==' ') {
//				i++;
//			}
//			int j=i;
//			while(j<s.length() && s.charAt(j)!=' ') {
//				j++;
//			}
//			int x = j;
//			j--;
//			while(i<=j) {
//				System.out.print(s.charAt(j));
//				j--;
//			}
//			System.out.print(" ");
//			i = x;
//		}
		
		// hashcode inbuilt
		
		System.out.println(s.hashCode());
		
//		int []arr = {1,2,3,1,3,2,1,3,2};
//		
//		
//		int i=0, j=arr.length-1, k=0;
//		while(k<=j) {
//			if(arr[k]==1) {
//				int t = arr[k];
//				arr[k] = arr[i];
//				arr[i] = t;
//				i++;
//			}
//			else if(arr[k]==3) {
//				int t = arr[k];
//				arr[k] = arr[j];
//				arr[j] = t;
//				j--;
//			}
//			k++;
//		}
//		System.out.println(Arrays.toString(arr));
	}

}
