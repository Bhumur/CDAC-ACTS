package com.cdac.acts.account.type;

import java.time.LocalDate;

import com.cdac.acts.account.Account;
import com.cdac.acts.enums.AccountTypeEnum;
import com.cdac.acts.interfaces.Depositable;
import com.cdac.acts.interfaces.Withdrwable;

public class Saving extends Account implements Depositable, Withdrwable{
	public Saving() {
		super();
	}
	public Saving(String accountName, LocalDate dateOfOpening, double balcance, AccountTypeEnum type) {
		super(accountName,dateOfOpening,balcance,type);
	}
	
	public double applyInterst() {
		return 0.03;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Saving []";
	}
	@Override
	public double withdraw(double a) {
		this.setBalcance(this.getBalcance()-a);
		return 0;
	}
	@Override
	public double depoist(double a) {
		this.setBalcance(this.getBalcance()+a);
		return 0;
	}
}
