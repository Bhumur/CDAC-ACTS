package com.cdac.acts.functions.strings;

public class UpperLower{
	public static String Up(String s){
		String ans = "";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='a' &&s.charAt(i)<='z'){
				ans+=(char)(s.charAt(i)-('a'-'A'));
			}
			else{
				ans+=s.charAt(i);
			}
		}
		return ans;
	}
	public static String Low(String s){
		String ans = "";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='A' &&s.charAt(i)<='Z'){
				ans+=(char)(s.charAt(i)+('a'-'A'));
			}
			else{
				ans+=s.charAt(i);
			}
		}
		return ans;
	}
}