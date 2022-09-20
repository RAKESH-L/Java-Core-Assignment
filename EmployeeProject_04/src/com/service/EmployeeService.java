package com.service;

import java.util.ArrayList;
import java.util.Comparator;

import com.beans.Employee;

public class EmployeeService {

	public void sortASC(ArrayList<Employee> list) {
		// TODO Auto-generated method stub
		System.out.println("------------Employees Sorted By Ascending order By Salary-----------");
		list.sort(Comparator.comparingDouble(Employee::getSalary));
		for(Employee e: list) {
			System.out.println(e);
			}
	}

	public void sortDESC(ArrayList<Employee> list) {
		// TODO Auto-generated method stub
		System.out.println("------------Employees Sorted By Ascending order By Salary-----------");
		list.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
		for(Employee e: list) {
			System.out.println(e);
		}
	}
}
