package com.cdac.acts.tester;

import java.util.Scanner;

public class FindOccurrence {

//	public static int findOccurrence(String str, String word) {
//		for(int i=0,j=0,k=0;i<str.length();i++) {
//			if(str.charAt(i)==word.charAt(j)) {
//				for(j=1,k=i+1;j<word.length() && k<str.length();j++,k++) {
//					if(str.charAt(k)!=word.charAt(j)) {
//						j=0;
//						break;
//					}
//				}
//				if(j==word.length()) {
//					return i;
//				}
//			}
//		}
//		return -1;
//	}
	
	public static boolean isequal(String str, String word, int s, int e) {
		for(int i=s,j=0;i<e;i++,j++) {
			if(str.charAt(i)!=word.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
	public static int wordPresent(String str, String word) {
		int count=0;
		for(int i=0,j=0;i<str.length() && j<str.length();i++,j++) {
			if(str.charAt(i)!=' ')
			{
				while(j<str.length() && str.charAt(j)!=' ') {
					j++;
				}
				if(word.length()==j-i && isequal(str, word, i, j)) {
					count++;
				}
				else {
					i=j;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String in which Want to Find : ");
		String str = sc.nextLine();
		System.out.print("Enter Word : ");
		String word = sc.next();
		int x = wordPresent(str, word);
		if(x>=0) {
			System.out.println(word + " is Present in " + str + " " + x + " Times");
		}
		else {
			System.out.println(word + " is NOT Present in " + str);
		}
		sc.close();
	}

}
