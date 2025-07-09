package com.cdac.acts.tester;
import com.cdac.acts.rough.Rough;
public class Test1 {

	String ss = "Hi";
	
	public void check() {
		
		String str2 = "Hi";
		
		if(str2 == ss) {
			System.out.println("2 obj same");
		}
		else {
			System.out.println("2 obj not same");
		}
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		
		t.check();
		

	}

}
