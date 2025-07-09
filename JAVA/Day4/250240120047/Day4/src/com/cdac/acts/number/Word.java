package com.cdac.acts.number;

public class Word {
	public static String word(int n){
		String []units = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String []elevens = {"eleven","twelve","thrirten","fourthen","fiftien","sixtien","seventen","eighten","nineten"};
		String []tens = {"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		String ans;
		if(n<10){
			ans = units[n];
		}
		else if(n<20 && n>10){
			ans = elevens[n-11];
		}
		else if(n%10==0){
			ans = tens[(n/10)-1];
		}
		else{
			ans = tens[(n/10)-1] + " " + units[n%10];
		}
		return ans;
	}
}
