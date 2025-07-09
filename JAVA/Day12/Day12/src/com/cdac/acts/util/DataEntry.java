package com.cdac.acts.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


import com.cdac.acts.account.Account;
import com.cdac.acts.account.type.Saving;
import com.cdac.acts.fruits.Fruit;

public class DataEntry {
	public static String strDate() {
		return "12/04/2025";
	}
	
	public static List<Account> listAccountDetails() {
		List<Account> acc = new LinkedList<>();
		acc.add(new Saving("Bhumur",Date.strToLocalDate("12/04/2025"),12000.5));
		acc.add(new Saving("Mukul",Date.strToLocalDate("18/11/2014"),18500.5));
		acc.add(new Saving("Pratik",Date.strToLocalDate("11/02/2005"),16900.5));
		acc.add(new Saving("Anuj",Date.strToLocalDate("09/04/2008"),124100.5));
		acc.add(new Saving("Archit",Date.strToLocalDate("11/10/2015"),25670.5));
		acc.add(new Saving("Satayam",Date.strToLocalDate("08/05/2020"),14555));
		acc.add(new Saving("Pranav",Date.strToLocalDate("12/08/2021"),19452.5));
		acc.add(new Saving("Uday",Date.strToLocalDate("12/09/2017"),2536.25));
		acc.add(new Saving("Raj",Date.strToLocalDate("12/04/1998"),2536.25));
		Collections.shuffle(acc);
		return acc;
	}
	
	public static List<Fruit> listFruits() {
		List<Fruit> fruit = new LinkedList<>();
		fruit.add(new Fruit("apple", "red", 78.5, 12));
		fruit.add(new Fruit("pineapple", "lightgreen", 58.45, 124));
		fruit.add(new Fruit("banana", "yellow", 34.5, 122));
		fruit.add(new Fruit("berry", "blue", 98.5, 12));
		fruit.add(new Fruit("cherry", "redish", 72.35, 1));
		fruit.add(new Fruit("orange", "orange", 7.25, 42));
		fruit.add(new Fruit("grapes", "green", 632.5, 62));
		fruit.add(new Fruit("pomograned", "red", 44.5, 2));
		fruit.add(new Fruit("dates", "brown", 80.5, 8));
		fruit.add(new Fruit("dragonfruit", "pink", 18.5, 90));
		Collections.shuffle(fruit);
		return fruit;
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
