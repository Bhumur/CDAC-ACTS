package com.cdac.acts.employee.type;

import java.time.LocalDate;

import com.cdac.acts.address.Address;
import com.cdac.acts.employee.Employee;
import com.cdac.acts.enums.DeptEnum;
import com.cdac.acts.enums.TypeEmp;

public class ParmanentEmployee extends Employee{
	
	private double basic;
	private double allowance;
	private double bonus;
	public ParmanentEmployee() {
		super();
		this.basic = 0;
		this.allowance = 0;
		this.bonus = 0;
	}
	public ParmanentEmployee(String name, LocalDate doj, DeptEnum dept, Address address, TypeEmp type ,double basic, double allowance, double bonus) {
		super(name, doj, dept, address, type);
		this.basic = basic;
		this.allowance = allowance;
		this.bonus = bonus;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public double CalSalary() {
		return basic+allowance+bonus;
	}
	@Override
	public String toString() {
		return super.toString() + " ParmanentEmployee [basic=" + basic + ", allowance=" + allowance + ", bonus=" + bonus + "]";
	}
	
	
}