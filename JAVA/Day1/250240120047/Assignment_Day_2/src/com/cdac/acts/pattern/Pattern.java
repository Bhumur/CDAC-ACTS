package com.cdac.acts.pattern;
public class Pattern{
	public static void p1(int n){
		for(int i=n;i>0;i--){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void p2(int n){
		for(int i=1;i<=n;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void p3(int n){
		for(int i=n;i>0;i--){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			for(int j=1;j<2*(n-i);j++){
				if(i!=n)
					System.out.print(" ");
			}
			for(int j=0;j<i;j++){
				if(i==n && j==0)
					j++;
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	public static void p4(int n){
		for(int i=n;i>0;i--){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(i!=1)
					System.out.print("*");
			}
			if(i!=1)
				System.out.println();
		}
	}
}