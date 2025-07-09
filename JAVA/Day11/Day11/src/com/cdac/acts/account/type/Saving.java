package com.cdac.acts.account.type;

import java.time.LocalDate;

import com.cdac.acts.account.Account;
import com.cdac.acts.exception.MinBalanceException;

public class Saving extends Account{
	public Saving() {
		super();
	}
	public Saving(String accountName, LocalDate dateOfOpening, double balance) {
		super(accountName,dateOfOpening,balance);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Saving []";
	}
	
	public void deposit(double a) {
		setBalance(a);
	}
	
	public void withDrew(double a) throws MinBalanceException {
		if(getBalance()<= 1000 + a) {
			throw new MinBalanceException("Mininmum Balace Exception");
		}
		else {
			setBalance(getBalance() + a);
		}
	}
}
