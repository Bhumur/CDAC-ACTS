package com.cdac.acts.person;

import java.time.LocalDate;

import com.cdac.acts.address.Address;

public class Person {
	private static int paraInc = 1001;
	private int adharNo;
	private String name;
	private LocalDate dob;
	private Address address;
	
	public Person() {
		this.adharNo = paraInc++;
		this.name = "";
		this.dob = null;
		this.address = null;
	}
	
	public Person(String name, LocalDate dob, Address address) {
		this.adharNo = paraInc++;
		this.name = name;
		this.dob = dob;
		this.address = address;
	}
	
	public int getadharNo() {
		return adharNo;
	}

	public String getname() {
		return name;
	}
	
	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [adharNo=" + adharNo + ", name=" + name + ", dob=" + dob + ", address=" + address.toString() + "]";
	}
	
	
}
