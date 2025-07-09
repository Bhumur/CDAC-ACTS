package com.acts;

import com.acts.Address;

public class Student {
	private int rollNo;
	private String name;
	private String course;
	
	//Student has Address so creating ref. of Address class in this class
	private Address address;
	
	public Student() {
		this.rollNo = 0;
		this.name = "";
		this.course = "";
		this.address = null;
	}


	public Student(int rollNo, String name, String course, Address address) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", address=" + address.toString() + "]";
	}

}
