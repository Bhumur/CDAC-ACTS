package com.cdac.acts.school;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private StudentKey sk;
	private String name;
	public Student(StudentKey sk, String name) {
		this.sk = sk;
		this.name = name;
	}
	public StudentKey getSk() {
		return sk;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [sk=" + sk + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, sk);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && Objects.equals(sk, other.sk);
	}
	
	@Override
	public int compareTo(Student o) {
		return sk.compareTo(o.getSk());
	}
	
}
