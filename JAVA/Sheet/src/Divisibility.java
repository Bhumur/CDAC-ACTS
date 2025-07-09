package com.cdac.acts.functions.numbers;
import com.cdac.acts.functions.numbers.DigitSum;
public class Divisibility{
	public static boolean div2(String s){
		if((s.charAt(s.length()-1)-'0')%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean div3(String s){
		if((DigitSum.digitsum(s))%3==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean div4(String s){
		int sum=0;
		if(s.length()>1){
			sum = s.charAt(s.length()-1)-'0' + 10*s.charAt(s.length()-2);
		}
		else{
			sum = s.charAt(s.length()-1)-'0';
		}
		if(sum%4==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean div5(String s){
		if(s.charAt(s.length()-1)=='5' || s.charAt(s.length()-1)=='0'){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean div6(String s){
		if(div2(s) && div3(s)){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean div9(String s){
		if((DigitSum.digitsum(s))%9==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean div25(String s){
		if(s.length()<2)
				return false;
		if(s.charAt(s.length()-1)=='0'){
			if(s.charAt(s.length()-2)=='5' || s.charAt(s.length()-2)=='0'){
				return true;
			}
			else{
				return false;
			}
		}
		else if(s.charAt(s.length()-1)=='5'){
			if(s.charAt(s.length()-2)=='2' || s.charAt(s.length()-2)=='7'){
				return true;
			}
			else{
				return false;
			}
		}
		return false;
	}
}