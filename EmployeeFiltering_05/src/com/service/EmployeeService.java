package com.service;

import java.util.ArrayList;

import com.beans.Employee;

public class EmployeeService {

	public void filteringSalary(ArrayList<Employee> list) {
		// TODO Auto-generated method stub
		System.out.println("------------Employees Salary Greater Than 80000-----------");
		for(Employee e: list) {
			if(e.getSalary()>80000) {
				System.out.println(e);
			}
		}
	}

	public void filteringCity(ArrayList<Employee> list) {
		// TODO Auto-generated method stub
		System.out.println("------------Employees who belongs to City London-----------");
		for(Employee e: list) {
			if(e.getCity()=="London") {
				System.out.println(e);
			}
		}

		
	}

}
