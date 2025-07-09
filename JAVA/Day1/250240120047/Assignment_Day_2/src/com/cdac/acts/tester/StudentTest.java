package com.cdac.acts.tester;
import com.cdac.acts.fun.StudentGrade;
import java.util.Scanner;

public class StudentTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name of Student : ");
		String name = sc.nextLine();
		System.out.print("Enter Percentage of Student : ");
		double per = sc.nextDouble();
		System.out.print(name+" is "+StudentGrade.tellgrade(per));
	}
}