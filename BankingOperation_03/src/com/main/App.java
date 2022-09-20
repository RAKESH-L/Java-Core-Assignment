package com.main;

import com.beans.Customer;
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
		
		System.out.println("-----------Withdraw Amount-----------");
		WithdrawalService ws = new WithdrawalService();
		ws.withdraw(c1, 45000);
		ws.withdraw(c2, 47000);
		System.out.println(c1);
		System.out.println(c2);
	}
}
