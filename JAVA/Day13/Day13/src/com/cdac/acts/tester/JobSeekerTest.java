package com.cdac.acts.tester;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.cdac.acts.util.DataEntry;
import com.cdac.acts.util.Date;
import com.cdac.acts.validation.DateValidation;
import com.cdac.acts.enums.DegreeEnum;

import com.cdac.acts.exception.DateExeption;
import com.cdac.acts.exception.InvalidPhoneNumber;

import com.cdac.acts.jobportal.JobSeeker;

public class JobSeekerTest {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			HashSet<JobSeeker> jobseekerset = DataEntry.setofjobseeker();
			int op;
			do {
				options();
				op = sc.nextInt();
				switch(op) {
					case 1: {
						System.out.println("_______________JobSeeker registration____________________");
						
						System.out.print("Enter Regesitration ID of Job Seeker : ");
						Integer	rid = sc.nextInt();
							
						
						System.out.print("Enter Name of Job Seeker : ");
						String name = sc.next();
						System.out.print("Enter Email of Job Seeker : ");
						String email = sc.next();
						System.out.print("Enter PassWord of Job Seeker : ");
						String password = sc.next();
						LocalDate dateofbirth=null;
						LocalDate dateofgrad=null;
						while(dateofbirth==null){
							try {
								System.out.println("Enter Date of Birth in formate dd/mm/yyyy : ");
								String strdate = sc.next();
								dateofbirth = Date.stringToDate(strdate);
							}catch (Exception e) {			
								System.out.println("Invalid Formate");
								continue;
							}
							try {
								if(DateValidation.datevalid(dateofbirth)==null) {
									throw new DateExeption("Date INVALID"); 
								}
							}
							catch (DateExeption e) {			
								System.out.println(e.getMessage());
								dateofbirth = null;
								continue;
							}
						}
						System.out.print("Enter aadharId of Job Seeker : ");
						String adhId = sc.next();
						String phoneNum = "";
						while(phoneNum=="") {
							try {
								System.out.print("Enter Phone Number of Job Seeker : ");
								phoneNum = sc.next();
								checkPhoneNumber(phoneNum);
							}catch (InvalidPhoneNumber e) {
								System.out.println(e.getMessage());
								phoneNum = "";
								continue;
							}
						}
						while(dateofgrad==null){
							try {
								System.out.println("Enter Date of Birth in formate dd/mm/yyyy : ");
								String strdate = sc.next();
								dateofgrad = Date.stringToDate(strdate);
							}catch (Exception e) {			
								System.out.println("Invalid Formate");
								continue;
							}
							try {
								if(DateValidation.datevalid(dateofgrad)==null) {
									throw new DateExeption("Date INVALID"); 
								}
							}
							catch (DateExeption e) {			
								System.out.println(e.getMessage());
								dateofgrad = null;
								continue;
							}
						}
						DegreeEnum degree =null;
						while(degree==null) {
							try {
								System.out.print("Enter Degree : ");
								String strdegree = sc.next();
								degree = DegreeEnum.valueOf(strdegree);
							}catch (Exception e){
								System.out.println("INVALID DEGREE");
								degree =null;
								continue;
							}
						}
						jobseekerset.add(new JobSeeker(rid,name,email,password,dateofbirth,adhId,phoneNum,dateofgrad,degree));
						System.out.print("JobSeeker is Added : ");
						break;
					}
					case 2: {
						System.out.println("_________DISPLAY________");
						for(JobSeeker j : jobseekerset) {
							System.out.println(j);
							//System.out.println(j.hashCode());
						}
					}
					case 3: {
						System.out.println("_______________Update email____________________");
						System.out.print("Enter Old Email : ");
						String oldEmail = sc.next();
						JobSeeker j =null;
						j = checkEmail(jobseekerset, oldEmail);
						if(j==null) {
							System.out.println("INVALID EMAIL");
							break;
						}
						System.out.print("Enter New Email : ");
						String newEmail = sc.next();
						j.setEmail(newEmail);
						System.out.println("EMAIL CHANGED SUCCESSFULLY");
						System.out.println(j);
						break;
					}
					case 4: {
						System.out.println("_______________Display all job seeker by their degree type. take degree from user____________________");
						System.out.print("Enter Degree : ");
						DegreeEnum degree =null;
						while(degree==null) {
							try {
								System.out.print("Enter Degree : ");
								String strdegree = sc.next();
								degree = DegreeEnum.valueOf(strdegree);
							}catch (Exception e){
								System.out.println("INVALID DEGREE");
								degree =null;
								continue;
							}
						}
						for(JobSeeker j : jobseekerset) {
							if(j.getDegree()==degree) {
								System.out.println(j);
							}
						}
						break;
					}
					case 5: {
						System.out.println("_______________Sort JobSeeker details as per email (Comparable)____________________");
						List<JobSeeker> list = new LinkedList<>(jobseekerset);
						Collections.sort(list);
						for(JobSeeker j : list) {
							System.out.println(j);
						}
						break;
					}
					case 6: {
						System.out.println("_______________Sort JobSeeker details as per dob (Comparator)____________________");
						List<JobSeeker> list = new LinkedList<>(jobseekerset);
						Collections.sort(list, new Comparator<JobSeeker>() {
							@Override
							public int compare(JobSeeker j1, JobSeeker j2) {
								return j1.getDateOfBirth().compareTo(j2.getDateOfBirth());
							}
						});
						for(JobSeeker j : list) {
							System.out.println(j);
						}
						break;
					}
					case 7: {
						System.out.println("_______________Sort customer details as per graduationDate (Comparator)____________________");
						List<JobSeeker> list = new LinkedList<>(jobseekerset);
						Collections.sort(list, new Comparator<JobSeeker>() {
							@Override
							public int compare(JobSeeker j1, JobSeeker j2) {
								return j1.getGraduationDate().compareTo(j2.getGraduationDate());
							}
						});
						for(JobSeeker j : list) {
							System.out.println(j);
						}
						break;
					}
					case 0: break;
					default: System.out.println("INVALID INPUT");
				}
				
			}while(op!=0);
		}
	}

	public static JobSeeker checkEmail(HashSet<JobSeeker> jobseekers, String oldEmail) {
		for(JobSeeker j : jobseekers) {
			if(j.getEmail()==oldEmail) {
				return j;
			}
		}
		return null;
	}

	private static void checkPhoneNumber(String s) throws InvalidPhoneNumber {
		if(s.length()!=10) {
			throw new InvalidPhoneNumber("INVALID PHONE NUMBER");
		}
		for(int i=0;i<10;i++) {
			if(s.charAt(i)<'0' || s.charAt(i)>'9') {
				throw new InvalidPhoneNumber("INVALID PHONE NUMBER");
			}
		}
	}

	private static void options() {
		System.out.println("OPTIONS :-");
		System.out.println("1. JobSeeker registration");
		System.out.println("2. Display");
		System.out.println("3. Update email");
		System.out.println("4. Display all job seeker by their degree type. take degree from user");
		System.out.println("5. Sort JobSeeker details as per email (Comparable)");
		System.out.println("6. Sort JobSeeker details as per dob (Comparator)");
		System.out.println("7. Sort customer details as per graduationDate (Comparator)");
		System.out.println("0. Exit");
		System.out.println("\nEnter Your Choice : ");
	}

}
