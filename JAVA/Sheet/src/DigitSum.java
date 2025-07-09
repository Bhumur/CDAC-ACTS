package com.cdac.acts.functions.numbers;
public class DigitSum{
	public static int digitsum(String s){
		int sum = 0;
		for(int i=0;i<s.length();i++){
			sum+=s.charAt(i)-'0';
		}
		return sum;
	}
}