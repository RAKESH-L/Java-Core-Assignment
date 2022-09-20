package com.main;

import com.beans.Customer;

public interface Withdrawal {
	double limit=50000; 
	void withdraw(Customer c, double amount); 
}
