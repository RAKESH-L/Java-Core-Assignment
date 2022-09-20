package com.service;

import com.beans.Customer;
import com.exception.InsufficientFundsExp;
import com.exception.OverTheLimitExp;
import com.main.Withdrawal;

public class WithdrawalService implements Withdrawal{
	
	Customer c= new Customer();
	
	@Override
	public void withdraw(Customer c, double amount) throws OverTheLimitExp, InsufficientFundsExp{
		
		if(amount > Withdrawal.limit)
			throw new OverTheLimitExp("Limit 50000 Exceeded");
		if(amount > c.getBalance())
			throw new InsufficientFundsExp("Insufficient Funds");
		c.setBalance(c.getBalance()-amount);
			
	}
}
