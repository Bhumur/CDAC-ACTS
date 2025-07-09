package com.cdac.acts.account;

import java.time.LocalDate;

import com.cdac.acts.exception.MinBalanceException;



public class Account {
	private static int paraInc=1001;
	private int accountNumber;
	private String accountName;
	private LocalDate dateOfOpening;
	private double balcance;
	
	public Account() {
		this.accountNumber = paraInc++;
		this.accountName = "";
		this.dateOfOpening = null;
		this.balcance = 0.0;
	}
	public Account(String accountName, LocalDate dateOfOpening, double balcance) {
		this.accountNumber = paraInc++;
		this.accountName = accountName;
		this.dateOfOpening = dateOfOpening;
		this.balcance = balcance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", dateOfOpening="
				+ dateOfOpening + ", balcance=" + balcance  + "]";
	}
	public double withDrew(double amount) throws MinBalanceException {
		if (getBalcance() < amount) {
			throw new MinBalanceException("Min balance in Saving account");
		}
		setBalcance(getBalcance() - amount);
		return getBalcance();
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}
	public void setDateOfOpening(LocalDate dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}
	public double getBalcance() {
		return balcance;
	}
	public void setBalcance(double balcance) {
		this.balcance = balcance;
	}
}
