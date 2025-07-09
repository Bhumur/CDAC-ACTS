package com.cdac.acts.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.cdac.acts.account.Account;
import com.cdac.acts.account.type.Current;
import com.cdac.acts.account.type.Saving;
import com.cdac.acts.enums.DegreeEnum;
import com.cdac.acts.jobportal.JobSeeker;

public class DataEntry {
	public static String strDate() {
		return "12/04/2025";
	}

	public static ArrayList<Account> listAccountDetails() {
		ArrayList<Account> acc = new ArrayList<>();
		acc.add(new Saving("Bhumur",Date.stringToDate("12/04/2025"),12000.5));
		acc.add(new Current("Mukul",Date.stringToDate("18/11/2014"),18500.5));
		acc.add(new Saving("Pratik",Date.stringToDate("11/02/2005"),16900.5));
		acc.add(new Saving("Anuj",Date.stringToDate("09/04/2008"),124100.5));
		acc.add(new Current("Archit",Date.stringToDate("11/10/2015"),25670.5));
		acc.add(new Saving("Satayam",Date.stringToDate("08/05/2020"),14555));
		acc.add(new Current("Pranav",Date.stringToDate("12/08/2021"),19452.5));
		acc.add(new Saving("Uday",Date.stringToDate("12/09/2017"),2536.25));
		acc.add(new Current("Raj",Date.stringToDate("12/04/1998"),2536.25));
		Collections.shuffle(acc);
		return acc;
	}
	
	
	public static HashSet<JobSeeker> setofjobseeker() {
		HashSet<JobSeeker> job = new HashSet<JobSeeker>();
		job.add(new JobSeeker(1,"Bhumur","bhumur@gmail.com","1234",Date.stringToDate("12/04/2000"),"123456789101","9462796017",Date.stringToDate("12/04/2025"),DegreeEnum.valueOf("BTECH")));
		job.add(new JobSeeker(2,"Mukul","mukul@gmail.com","1234",Date.stringToDate("18/05/2005"),"123456789101","9462796017",Date.stringToDate("18/11/2014"),DegreeEnum.valueOf("MTECH")));
		job.add(new JobSeeker(3,"Pratik","pratilk@gmail.com","1234",Date.stringToDate("12/04/2000"),"123456789101","9462796017",Date.stringToDate("11/02/2005"),DegreeEnum.valueOf("CA")));
		job.add(new JobSeeker(4,"Anuj","anuj@gmail.com","1234",Date.stringToDate("01/07/1989"),"123456789101","9462796017",Date.stringToDate("09/04/2008"),DegreeEnum.valueOf("MBBS")));
		job.add(new JobSeeker(5,"Archit","archit@gmail.com","1234",Date.stringToDate("22/09/1985"),"123456789101","9462796017",Date.stringToDate("11/10/2015"),DegreeEnum.valueOf("BTECH")));
		job.add(new JobSeeker(6,"Satayam","satayam@gmail.com","1234",Date.stringToDate("08/05/2001"),"123456789101","9462796017",Date.stringToDate("17/08/2015"),DegreeEnum.valueOf("MTECH")));
		job.add(new JobSeeker(7,"Pranav","pranav@gmail.com","1234",Date.stringToDate("12/04/2010"),"123456789101","9462796017",Date.stringToDate("12/08/2021"),DegreeEnum.valueOf("CA")));
		job.add(new JobSeeker(8,"Uday","uday@gmail.com","1234",Date.stringToDate("15/09/2002"),"123456789101","9462796017",Date.stringToDate("12/09/2017"),DegreeEnum.valueOf("MBBS")));
		job.add(new JobSeeker(9,"Raj","raj@gmail.com","1234",Date.stringToDate("02/06/2000"),"123456789101","9462796017",Date.stringToDate("12/04/1998"),DegreeEnum.valueOf("MTECH")));
		return job;
	}
	
	
	public static Integer genInteger() {
		List<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<100;i++) {
			arr.add(i);
		}
		Collections.shuffle(arr);
		return arr.get(0);
	}

	
}
