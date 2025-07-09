package com.cdac.acts.employee;

import java.time.LocalDate;

import com.cdac.acts.Enums.DeptEnum;

public class Employee {
	private static int paraInt = 1001;
	private int empNo;
	private String name;
	private LocalDate dob;
	private LocalDate doj;
	private DeptEnum dept;
	
	public Employee() {
		this.empNo = paraInt++;
		this.name = "";
		this.dob = null;
		this.doj = null;
		this.dept = null;
	}

	public Employee(String name, LocalDate dob, LocalDate doj, DeptEnum dept) {
		this.empNo = paraInt++;
		this.name = name;
		this.dob = dob;
		this.doj = doj;
		this.dept = dept;
	}
	
	public LocalDate getDoj() {
		return doj;
	}
	
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public DeptEnum getDept() {
		return dept;
	}

	public void setDept(DeptEnum dept) {
		this.dept = dept;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", dob=" + dob + ", doj=" + doj + ", dept=" + dept.getValue() + "]";
	}
	
	
}
