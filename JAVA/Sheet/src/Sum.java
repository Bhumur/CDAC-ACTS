package com.cdac.acts.functions.numbers;
public class Sum{
	public static String sum(String s1, String s2){
		if(s1.length()<s2.length()){
			String s = s1;
			s1 = s2;
			s2 = s;
		}
		int carry=0;
		char []c1 = s1.toCharArray();
		char []c2 = s2.toCharArray();
		char []ans = new char[c1.length+1];
		for(int i=c1.length-1,j=c2.length-1,k=c1.length;k>=0;){
			if(i>=0 && j>=0){
				int x = c1[i]-'0' + c2[j]-'0' + carry;
				carry = 0;
				if(x>9){
					carry=1;
					ans[k]=(char)(x-10+'0');
				}
				else{
					ans[k]=(char)(x+'0');
				}
				i--;
				j--;
				k--;
			}
			else if(i>=0 && j<0){
				if(carry==0){
					ans[k]=c1[i];
				}
				else{
					int x = c1[i]-'0' + carry;
					carry = 0;
					if(x>9){
						carry=1;
						ans[k]=(char)(x-10+'0');
					}
					else{
						ans[k]=(char)(x+'0');
					}
				}
				i--;
				k--;
			}
			else if(i<0 && j<0 && carry!=0){
				ans[k]=(char)(carry+'0');
				k--;
			}
			else{
				ans[k]=' ';
				k--;
			}
		}
		String s = new String(ans);
		return s;
	}
}