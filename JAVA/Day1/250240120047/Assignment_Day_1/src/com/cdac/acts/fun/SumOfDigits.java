package com.cdac.acts.fun;

public class SumOfDigits{
	public static int sumofdigits(int n){
		if(n==0)
			return 0;
		return n%10 + sumofdigits(n/10);
	}
}