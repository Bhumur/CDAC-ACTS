package com.cdac.acts.functions.strings;

public class NamePrint{
	public static String Name(String f,String l){
		String ans= "";
		ans+=f.substring(0,1).toUpperCase();
		ans+=f.substring(1,f.length()).toLowerCase();
		ans+=l.substring(0,1).toUpperCase();
		ans+=l.substring(1,l.length()).toLowerCase();
		return ans;
	}
}