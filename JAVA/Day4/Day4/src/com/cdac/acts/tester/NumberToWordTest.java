package com.cdac.acts.tester;

import java.util.Scanner;
import com.cdac.acts.number.Word;

public class NumberToWordTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s="";
		System.out.print("Enter Number to be Print in word : ");
		String n = sc.next();
		int []arr = new int[9];
		int size = n.length();
		for(int i=0;i<n.length();i++){
			arr[i]=n.charAt(size-i-1)-'0';
		}
		int x = arr[0]+10*arr[1];
		s = Word.word(x);
		if(arr[2]!=0){
			s = Word.word(arr[2]) + " hundred " + s;
		}
		if(arr[3]!=0 || arr[4]!=0){
			s = Word.word(arr[3]+10*arr[4]) + " thousand " + s;
		}
		if(arr[5]!=0 || arr[6]!=0){
			s = Word.word(arr[5]+10*arr[6]) + " lakh " + s;
		}
		if(arr[7]!=0 || arr[8]!=0){
			s = Word.word(arr[7]+10*arr[8]) + " crore " + s;
		}
				
		System.out.print(s);
		sc.close();

	}

}
