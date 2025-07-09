package com.cdac.acts.tester;
import java.util.Scanner;
public class WordPresentTest {
	
//	public static boolean wordPresent(String str, String word) {
//		for(int i=0,j=0,k=0;i<str.length();i++) {
//			if(str.charAt(i)==word.charAt(j)) {
//				for(j=1,k=i+1;j<word.length() && k<str.length();j++,k++) {
//					if(str.charAt(k)!=word.charAt(j)) {
//						j=0;
//						break;
//					}
//				}
//				if(j==word.length()) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
	
	public static boolean isequal(String str, String word, int s, int e) {
		for(int i=s,j=0;i<e;i++,j++) {
			if(str.charAt(i)!=word.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean wordPresent(String str, String word) {
		for(int i=0,j=0;i<str.length() && j<str.length();i++,j++) {
			if(str.charAt(i)!=' ')
			{
				while(j<str.length() && str.charAt(j)!=' ') {
					j++;
				}
				if(word.length()==j-i && isequal(str, word, i, j)) {
					return true;
				}
				else {
					i=j;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String in which Want to Find : ");
		String str = sc.nextLine();
		System.out.print("Enter Word : ");
		String word = sc.next();
		if(wordPresent(str, word)) {
			System.out.println(word + " is Present in " + str);
		}
		else {
			System.out.println(word + " is NOT Present in " + str);
		}
		sc.close();
	}

}
