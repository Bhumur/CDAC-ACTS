package com.cdac.acts.employee;

public class Employee {
	public static int parainc=1000;
	private int EmpId;
	private String Name;
	private double Salary;
	
	public Employee(String Name, double Salary) {
		this.EmpId = parainc++;
		this.Name = Name;
		this.Salary = Salary;
	}

	public int getEmpId() {
		return EmpId;
	}

	public double getSalary() {
		return Salary;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + EmpId + ", name=" + Name + ", marks=" + Salary + "]";
	}
}
