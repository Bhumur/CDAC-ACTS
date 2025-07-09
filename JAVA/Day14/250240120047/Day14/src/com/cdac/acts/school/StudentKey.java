package com.cdac.acts.school;

public final class StudentKey implements Comparable<StudentKey>{
	private final Integer standard;
	private final String division;
	private final Integer rollNo;
	
	public StudentKey(Integer standard, String division, Integer rollNo) {
		this.standard = standard;
		this.division = division;
		this.rollNo = rollNo;
	}

	public Integer getStandard() {
		return standard;
	}

	public String getDivision() {
		return division;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	@Override
	public String toString() {
		return "StudentKey [standard=" + standard + ", division=" + division + ", rollNo=" + rollNo + "]";
	}
	
	@Override
	public int hashCode() {
		int hash = 1;
		hash = 31 * hash + (null == rollNo ? 0 : rollNo.hashCode());
		hash = 31 * hash + (null == standard ? 0 : standard.hashCode());
		hash = 31 * hash + (null == division ? 0 : division.hashCode());
		return hash;
	}
	
	public boolean equals(Object obj) {
		if(null == obj) {
			return false;
		}
		if(this == obj) {
			return true;
		}
		if(this.getClass()!=obj.getClass()) {
			return false;
		}
		StudentKey sk = (StudentKey)obj;
		return (this.getDivision().equals(sk.getDivision())) && (this.getStandard().equals(sk.getStandard())) && (this.getRollNo().equals(sk.getRollNo()));
	}


	@Override
	public int compareTo(StudentKey o) {
		if(rollNo.compareTo(o.rollNo)!=0) {
			return rollNo.compareTo(o.rollNo);
		}
		if(division.compareTo(o.division)!=0) {
			return division.compareTo(o.division);
		}
		return standard.compareTo(o.standard);
	}
	
}
