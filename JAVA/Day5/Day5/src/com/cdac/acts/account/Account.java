package com.cdac.acts.account;

public class Account {
	public static int paraacc = 12345;
	private int accno;
	private String name;
	private double balance;
	
	
	public Account(String name) {
		super();
		this.accno = paraacc++;
		this.name = name;
		this.balance = 0;
	}


	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
	}


	public int getAccno() {
		return accno;
	}

	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
