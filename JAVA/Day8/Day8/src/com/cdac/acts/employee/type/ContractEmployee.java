package com.cdac.acts.employee.type;

import java.time.LocalDate;

import com.cdac.acts.address.Address;
import com.cdac.acts.employee.Employee;
import com.cdac.acts.enums.DeptEnum;
import com.cdac.acts.enums.TypeEmp;

public class ContractEmployee extends Employee {
	
	private double rate;
	private int noOfDays;
	public ContractEmployee() {
		super();
		this.rate = 0;
		this.noOfDays = 0;
	}
	public ContractEmployee(String name, LocalDate doj, DeptEnum dept, Address address, TypeEmp type ,double rate, int noOfDays) {
		super(name, doj, dept, address, type);
		this.rate = rate;
		this.noOfDays = noOfDays;
	}
	
	public double getRate() {
		return rate;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	@Override
	public double CalSalary() {
		return rate*noOfDays;
	}
	@Override
	public String toString() {
		return super.toString() + "ContractEmployee [rate=" + rate + ", noOfDays=" + noOfDays + "]";
	}
}
