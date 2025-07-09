package com.cdac.acts.interfaces;

import com.cdac.acts.exception.MinBalanceException;

public interface Withdrwable {
	void withdraw(double a) throws MinBalanceException;
}
