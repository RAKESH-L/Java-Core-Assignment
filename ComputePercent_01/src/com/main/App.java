package com.main;

import java.util.Scanner;

import com.service.A;

public class App {
	public static void main(String[] args) {
		A a = new A();
		int n=3;
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		double total = a.calculateTotal(arr);
		System.out.println("Total marks is " +total);
		
		double percent = a.computePercent(total,300.0);
		System.out.println("Percent is " +percent);
	}
}
