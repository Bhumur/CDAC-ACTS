package com.cdac.acts.student;

import java.time.LocalDate;

import com.cdac.acts.Enums.CourseEnum;

public class Student {
	private int rollNo;
	private String name;
	private LocalDate dob;
	private CourseEnum course;
	private static int paraInc=1001;
	
	public Student() {
		super();
		this.rollNo = paraInc++;
		this.name = "";
		this.dob = null;
		this.course = null;
	}

	public Student(String name, LocalDate dob, CourseEnum course) {
		this.rollNo = paraInc++;
		this.name = name;
		this.dob = dob;
		this.course = course;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dob=" + dob + ", course=" + course.getCourse() + "]";
	}
	
}
