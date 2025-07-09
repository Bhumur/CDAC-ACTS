package com.cdac.acts.account.type;

import java.time.LocalDate;

import com.cdac.acts.account.Account;
import com.cdac.acts.exception.MinBalanceException;
import com.cdac.acts.interfaces.Depositable;
import com.cdac.acts.interfaces.Intrestable;
import com.cdac.acts.interfaces.Withdrwable;

public class Saving extends Account implements Depositable, Withdrwable, Intrestable{
	public Saving() {
		super();
	}
	public Saving(String accountName, LocalDate dateOfOpening, double balcance) {
		super(accountName,dateOfOpening,balcance);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Saving []";
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
	public double depoist(double a) {
		this.setBalcance(this.getBalcance()+a);
		return 0;
	}
	@Override
	public void applyInterst() {
		this.setBalcance(this.getBalcance()*1.025);
	}
}
