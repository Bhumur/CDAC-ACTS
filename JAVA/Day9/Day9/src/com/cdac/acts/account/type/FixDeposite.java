package com.cdac.acts.account.type;

import java.time.LocalDate;

import com.cdac.acts.account.Account;
import com.cdac.acts.enums.AccountTypeEnum;
import com.cdac.acts.interfaces.Muturable;
import com.cdac.acts.util.Date;

public class FixDeposite extends Account implements Muturable{
	private LocalDate muturityDate;
	public FixDeposite() {
		super();
	}
	public FixDeposite(String accountName, LocalDate dateOfOpening, LocalDate muturityDate, double balcance, AccountTypeEnum type) {
		super(accountName,dateOfOpening,balcance,type);
		this.muturityDate = muturityDate;
	}
	@Override
	public String toString() {
		return super.toString() +"FixDeposite []";
	}
	@Override
	public double calculateMatutyAmount() {
		int x = (int)Date.datediffinyear(muturityDate,getDateOfOpening());
		double intrest;
		switch(x) {
			case 0: {
				intrest = 0;
			}
			case 1: {
				intrest = intrest1;
				break;
			}
			case 2: {
				intrest = intrest2;
				break;
			}
			case 3: {
				intrest = intrest3;
				break;
			}
			case 4: {
				intrest = intrest4;
				break;
			}
			case 5: {
				intrest = intrest5;
				break;
			}
			default: intrest = intrest5;
		}
		if(x>0) {
			return this.getBalcance()*(1 + (Math.pow((1+intrest/100),x)));
		}
		else {
			return 0;
		}
	}
}
