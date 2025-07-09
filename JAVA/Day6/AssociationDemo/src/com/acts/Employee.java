package com.acts;

import com.acts.Address;


public class Employee {
	private int EmpId;
	private String name;
	private double salary;
	private Address address;
	public Employee() {
		EmpId = 0;
		this.name = "";
		this.salary = 0;
		this.address = null;
	}
	public Employee(int empId, String name, double salary, Address address) {
		super();
		EmpId = empId;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
}
