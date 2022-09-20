package com.main;

import com.beans.Customer;
import com.exception.InsufficientFundsExp;
import com.exception.OverTheLimitExp;
import com.service.DepositService;
import com.service.WithdrawalService;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer(80631,"Rakesh L",30000);
		Customer c2 = new Customer(80632,"Lokesh NS",65000);
		
		System.out.println("-----------Initial Amount-----------");
		System.out.println(c1);
		System.out.println(c2);
		
		DepositService ds = new DepositService();
		ds.deposit(c1, 2000);
		ds.deposit(c2, 43678);
		
		System.out.println("-----------Deposited Amount-----------");
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("-----------Withdraw Amount for InsufficientFundsExp-----------");
		WithdrawalService ws = new WithdrawalService();
		try {
			ws.withdraw(c1, 45000);
		} 
		catch (InsufficientFundsExp e) { 
			System.out.println(e.getMessage());
		} 
		catch (OverTheLimitExp e) {
			System.out.println(e.getMessage());
		}
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("thank you");	
		System.out.println("-----------Withdraw Amount for OverTheLimitExp-----------");
		try {
			ws.withdraw(c2, 65000);
		} 
		catch (InsufficientFundsExp e) { 
			System.out.println(e.getMessage());
		} 
		catch (OverTheLimitExp e) {
			System.out.println(e.getMessage());
		}
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("thank you");	
	}
}
