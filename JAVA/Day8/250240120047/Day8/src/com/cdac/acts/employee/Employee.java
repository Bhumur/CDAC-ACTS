package com.cdac.acts.employee;

import java.time.LocalDate;

import com.cdac.acts.address.Address;
import com.cdac.acts.enums.DeptEnum;
import com.cdac.acts.enums.TypeEmp;

public abstract class Employee {
	
	private static int paraInc = 1001;
	
	private int empId;
	private String name;
	private LocalDate doj;
	private DeptEnum dept;
	private Address address;
	private TypeEmp type;
	
	public Employee() {
		super();
		this.empId = paraInc++;
		this.name = "";
		this.doj = null;
		this.dept = null;
		this.address = null;
		this.type = null;
	}
	public Employee(String name, LocalDate doj, DeptEnum dept, Address address, TypeEmp type) {
		super();
		this.empId = paraInc++;
		this.name = name;
		this.doj = doj;
		this.dept = dept;
		this.address = address;;
		this.type = type;
	}
	public int getEmpId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getDoj() {
		return doj;
	}
	
	public DeptEnum getDept() {
		return dept;
	}
	
	public TypeEmp getType() {
		return type;
	}
	public double CalSalary() {
		return 0.0;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", doj=" + doj + ", dept=" + dept.getValue() + ", address="
				+ address + ", type=" + type.getValue() + "]";
	}
	
	
}
