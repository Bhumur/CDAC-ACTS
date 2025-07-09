package com.cdac.acts.tester;

import java.util.Scanner;

public class MobileNumberTest {
	
	public static String Reverse(String s) {
		String ans = "";
		for(int i=s.length()-1;i>=0;i--) {
			ans += s.charAt(i);
		}
		return ans;
	}
	
	public static String formateMobileNumber(String s) {
		String mob = "";
		for(int i=s.length()-1;i>=0 ;i--) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				mob+=s.charAt(i);
			}
		}
		if(mob.length()!=10 && mob.length()!=12)
		{
			return "no";
		}
		mob = Reverse(mob);
		if(mob.length()==12) {
			if(mob.charAt(0)!='9' || mob.charAt(1)!='1' ) {
				return "no";
			}
		}
		StringBuilder ans = new StringBuilder(mob);
		ans.insert(0, "+91-");
		ans.insert(7, '-');
		ans.insert(11, '-');
		
		return ans.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile Number : ");
		String s = sc.next();
		String str = formateMobileNumber(s);
		if(s.length()<10 || str.equals("no")) {
			System.out.println("Entered Mobile Number is not Valid For India");
		}
		else {
			System.out.println("Valid Formate Of Mobile Number is : " + str);
		}	
		sc.close();
	}

}
