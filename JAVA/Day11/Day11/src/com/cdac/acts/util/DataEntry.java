package com.cdac.acts.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import com.cdac.acts.account.Account;
import com.cdac.acts.account.type.Saving;

public class DataEntry {
	public static String strDate() {
		return "12/04/2025";
	}
	
	public static Account listAccountDetails() {
		List<Account> acc = new ArrayList<>(7);
		
		Saving a = new Saving("Bhumur",Date.strToLocalDate(strDate()),12000.5);
		acc.add(a);
		a = new Saving("Mukul",Date.strToLocalDate(strDate()),18500.5);
		acc.add(a);
		a = new Saving("Pratik",Date.strToLocalDate(strDate()),16900.5);
		acc.add(a);
		a = new Saving("Anuj",Date.strToLocalDate(strDate()),124100.5);
		acc.add(a);
		a = new Saving("Archit",Date.strToLocalDate(strDate()),25670.5);
		acc.add(a);
		a = new Saving("Satayam",Date.strToLocalDate(strDate()),14555);
		acc.add(a);
		a = new Saving("Pranav",Date.strToLocalDate(strDate()),19452.5);
		acc.add(a);
		a = new Saving("Uday",Date.strToLocalDate(strDate()),2536.25);
		acc.add(a);
		Collections.shuffle(acc);
		return acc.get(0);
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
