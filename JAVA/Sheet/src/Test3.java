package com.cdac.acts.tester;
import com.cdac.acts.functions.strings.Palindrome;
import java.util.Scanner;
class Test3{
	public static void main(String []agr){
		System.out.print("Enter A String : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(Palindrome.isPalindrome(s)){
			System.out.print("Yes");
		}
		else{
			System.out.print("No");
		}
	}
}