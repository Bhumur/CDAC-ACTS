package com.cdac.acts.account;

import java.time.LocalDate;

import com.cdac.acts.enums.AccountTypeEnum;

public abstract class Account {
	private static int paraInc=1001;
	private int accountNumber;
	private String accountName;
	private LocalDate dateOfOpening;
	private double balcance;
	private AccountTypeEnum type;
	public Account() {
		this.accountNumber = paraInc++;
		this.accountName = "";
		this.dateOfOpening = null;
		this.balcance = 0.0;
		this.type = null;
	}
	public Account(String accountName, LocalDate dateOfOpening, double balcance, AccountTypeEnum type) {
		this.accountNumber = paraInc++;
		this.accountName = accountName;
		this.dateOfOpening = dateOfOpening;
		this.balcance = balcance;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", dateOfOpening="
				+ dateOfOpening + ", balcance=" + balcance + ", type=" + type.getValue() + "]";
	}
	public AccountTypeEnum getType() {
		return type;
	}
	public void setType(AccountTypeEnum type) {
		this.type = type;
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
