package com.cdac.acts.account;

import java.time.LocalDate;

import com.cdac.acts.exception.MinBalanceException;

public class Account {
	private static int paraInc = 1001;
	private int accNo;
	private String name;
	private LocalDate dateOfOpening;
	private double balance;
	
	
	public Account() {
		this.accNo = paraInc++;
		this.name = "";
		this.dateOfOpening = null;
		this.balance = 0.0;
	}
	
	
	public Account(String name, LocalDate dateOfOpening, double balance) {
		this.accNo = paraInc++;
		this.name = name;
		this.dateOfOpening = dateOfOpening;
		this.balance = balance;
	}
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}
	public void setDateOfOpening(LocalDate dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", dateOfOpening=" + dateOfOpening + ", balance="
				+ balance + "]";
	}
	
	
}
