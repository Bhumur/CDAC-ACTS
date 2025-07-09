package com.cdac.acts.fun;

public class StudentGrade{
	public static String tellgrade(double per){
		if(per<33)
			return "Fail";
		else if(per>=33 && per<50)
			return "Pass";
		else if(per>=50 && per<60)
			return "Second Class";
		else if(per>=60 && per<75)
			return "First Class";
		else
			return "Distinction";
	}
}