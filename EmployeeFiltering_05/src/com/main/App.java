package com.main;

import java.util.ArrayList;

import com.beans.Employee;
import com.service.EmployeeService;

public class App {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Harry Potter", "London", 85000);
		Employee e2 = new Employee(2, "Ronald weasley", "Surray", 75000);
		Employee e3 = new Employee(3, "Hermione Granger", "London", 95000);
		
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		for(Employee e : list) {
			System.out.println(e);
		}
		
		EmployeeService employeeService = new EmployeeService();
		employeeService.filteringSalary(list);
		
		employeeService.filteringCity(list);
	}
}
