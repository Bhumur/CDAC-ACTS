package com.cdac.acts.account.type;

import java.time.LocalDate;

import com.cdac.acts.account.Account;
import com.cdac.acts.exception.MinBalanceException;
import com.cdac.acts.interfaces.Depositable;
import com.cdac.acts.interfaces.Withdrwable;

public class Current extends Account implements Depositable, Withdrwable{
	public Current() {
		super();
	}
	public Current(String accountName, LocalDate dateOfOpening, double balcance) {
		super(accountName,dateOfOpening,balcance);
	}
	
	public double applyInterst() {
		return 0.03;
	}
	@Override
	public String toString() {
		return super.toString() +"Current []";
	}
	@Override
	public void withdraw(double a) throws MinBalanceException {
		if(this.getBalcance()-a <= 1000) {
			throw new MinBalanceException("Mininmum Balace Exception");
		}
		else {
			this.setBalcance(this.getBalcance()-a);
		}
	}
	@Override
	public double depoist(double amount) {
		this.setBalcance(this.getBalcance()+amount);
		return 0;
	}
	
}
