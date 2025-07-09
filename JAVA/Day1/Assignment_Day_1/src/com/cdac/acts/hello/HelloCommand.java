package com.cdac.acts.hello;
public class HelloCommand{
	public static void main(String[] args){
		if(args.length < 1)
			System.out.println("PLEASE INPUT COMMAND ARGUMENT");
		else
			System.out.println("Hello "+args[0]);
		return;
	}
}