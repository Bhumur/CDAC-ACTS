package com.cdac.acts.Enums;

public enum CourseEnum {
	PG_DAC("Post Graduation Diploma in DAC"),
	PG_DAI("Post Graduation Diploma in DAI"),
	PG_DITIS("Post Graduation Diploma in DITIS"),
	PG_DBDA("Post Graduation Diploma in DBDA");
	
	private String str;
	
	private CourseEnum(String str) {
		this.str = str;
	}
	
	public String getCourse() {
		return str;
	}
}
