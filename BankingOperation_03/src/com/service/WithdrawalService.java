package com.service;

import com.beans.Customer;
import com.main.Withdrawal;

public class WithdrawalService implements Withdrawal{
	
	Customer c= new Customer();
	
	@Override
	public void withdraw(Customer c, double amount){
		c.setBalance(c.getBalance()-amount);
			
	}
}
