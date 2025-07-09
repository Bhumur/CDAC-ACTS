package com.cdac.acts.employee;
import java.lang.String;
public class Employee{
	
	private int empNo;
	private String name;
	private double salary;
	private static int paraInc = 100000;
	public Employee(){
		this.empNo = paraInc++;
		this.name = "";
		this.salary = 0;
	}
	
	public Employee(String nam, double sal){
		this.empNo = paraInc++;
		this.name = nam;
		this.salary = sal;
	}
	
	public void printEmp(){
		System.out.println("No. is: "+this.empNo+" Name is:"+this.name+" Sal is:"+this.salary);
	}
		
	
}