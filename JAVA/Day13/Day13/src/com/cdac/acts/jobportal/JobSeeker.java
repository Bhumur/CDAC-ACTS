package com.cdac.acts.jobportal;

import java.time.LocalDate;


import com.cdac.acts.enums.DegreeEnum;

public class JobSeeker implements Comparable<JobSeeker>{
	private Integer registrationId;
	private String name;
	private String email;
	private String password;
	private LocalDate dateOfBirth;
	private String aadharId;
	private String phoneNumber;
	private LocalDate graduationDate;
	private DegreeEnum degree;
	
	
	
	public JobSeeker() {
		this.registrationId = 0;
		this.name = "";
		this.email = "";
		this.password = "";
		this.dateOfBirth = null;
		this.aadharId = "";
		this.phoneNumber = "";
		this.graduationDate = null;
		this.degree = null;
	}
	
	public JobSeeker(Integer rid, String name, String email, String password, LocalDate dateOfBirth, String aadharId, String phoneNumber, LocalDate graduationDate, DegreeEnum degree) {
		this.registrationId = rid;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.aadharId = aadharId;
		this.phoneNumber = phoneNumber;
		this.graduationDate = graduationDate;
		this.degree = degree;
	}

	public Integer getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(LocalDate graduationDate) {
		this.graduationDate = graduationDate;
	}

	public DegreeEnum getDegree() {
		return degree;
	}

	public void setDegree(DegreeEnum degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "JobSeeker [registrationId=" + registrationId + ", name=" + name + ", email=" + email + ", password="
				+ password + ", dateOfBirth=" + dateOfBirth + ", aadharId=" + aadharId + ", phoneNumber=" + phoneNumber
				+ ", graduationDate=" + graduationDate + ", degree=" + degree + "]";
	}
	
	@Override
	public int compareTo(JobSeeker a) {
		return this.getEmail().compareTo(a.getEmail());
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(aadharId, dateOfBirth, degree, email, graduationDate, name, password, phoneNumber,
//				registrationId);
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		JobSeeker other = (JobSeeker) obj;
//		return Objects.equals(aadharId, other.aadharId) && Objects.equals(dateOfBirth, other.dateOfBirth)
//				&& degree == other.degree && Objects.equals(email, other.email)
//				&& Objects.equals(graduationDate, other.graduationDate) && Objects.equals(name, other.name)
//				&& Objects.equals(password, other.password) && Objects.equals(phoneNumber, other.phoneNumber)
//				&& Objects.equals(registrationId, other.registrationId);
//	}
	
	@Override
	public int hashCode(){
		int hash =1;
		hash = 31 * hash + (null==registrationId ? 0:registrationId.hashCode());
		hash = 31 * hash + (null==name ? 0:name.hashCode());
		hash = 31 * hash + (null==email ? 0:email.hashCode());
		hash = 31 * hash + (null==password ? 0:password.hashCode());
		hash = 31 * hash + (null==dateOfBirth ? 0:dateOfBirth.hashCode());
		hash = 31 * hash + (null==aadharId ? 0:aadharId.hashCode());
		hash = 31 * hash + (null==phoneNumber ? 0:phoneNumber.hashCode());
		hash = 31 * hash + (null==graduationDate ? 0:graduationDate.hashCode());
		hash = 31 * hash + (null==degree ? 0:degree.hashCode());
		return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(null==obj) {
			return false;
		}
		if(this.getClass()==obj.getClass()) {
			return true;
		}
		if(this==obj) {
			return true;
		}
		JobSeeker j = (JobSeeker)obj;
		if(this.registrationId.equals(j.getRegistrationId()) 
				&& this.name.equals(j.getName()) 
						&& this.email.equals(j.getEmail()) 
								&& this.password.equals(j.getPassword()) 
										&& this.dateOfBirth.equals(j.getDateOfBirth()) 
												&& this.aadharId.equals(j.getAadharId()) 
														&& this.phoneNumber.equals(j.getPhoneNumber())  
																&& this.graduationDate.equals(j.getGraduationDate())  
																		&& this.degree.equals(j.getDegree())){
			return true;
		}
		
		return false;
	}
	
}
