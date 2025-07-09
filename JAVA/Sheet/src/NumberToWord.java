package com.cdac.acts.functions.numbers;
public class NumberToWord{
	public static String numtoword(String s){
		String ans = "";
		String []num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		for(int i=0;i<s.length();i++){
			ans+=num[s.charAt(i)-'0']+" ";
		}
		return ans;
	}
}