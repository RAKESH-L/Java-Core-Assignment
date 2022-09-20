package com.main;

import com.beans.Customer;
import com.exception.InsufficientFundsExp;
import com.exception.OverTheLimitExp;

public interface Withdrawal {
	double limit=50000; 
	void withdraw(Customer c, double amount) 
			throws InsufficientFundsExp, OverTheLimitExp;
}
