package com.cdac.acts.account.type;

import java.time.LocalDate;

import com.cdac.acts.account.Account;

public class Deposit extends Account{
	public Deposit() {
		super();
	}
	public Deposit(String accountName, LocalDate dateOfOpening, double balcance) {
		super(accountName,dateOfOpening,balcance);
	}
	@Override
	public double applyInterst() {
		return 0.03;
	}
	@Override
	public String toString() {
		return super.toString() +"Deposit []";
	}
	
}
