package com.cdac.acts.account;

import java.time.LocalDate;


public class Account implements Comparable<Account>{
	private int paraInc = 1001;
	private Integer accNo;
	private String name;
	private LocalDate dateOfOpening;
	private Double balance;
	
	
	public Account() {
		this.accNo=paraInc++;
		this.name = "";
		this.dateOfOpening = null;
		this.balance = 0.0;
	}
	
	
	public Account(String name, LocalDate dateOfOpening, Double balance) {
		this.accNo = paraInc++;
		this.name = name;
		this.dateOfOpening = dateOfOpening;
		this.balance = balance;
	}
	
	public Integer getAccNo() {
		return accNo;
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
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", dateOfOpening=" + dateOfOpening + ", balance="
				+ balance + "]";
	}
	
	@Override
	public int compareTo(Account a) {
		return a.accNo.compareTo(this.accNo);
	}
}
