package com.service;

import java.util.stream.IntStream;

public class A {
	public int calculateTotal(int[] arr) {
		int sum = IntStream.of(arr).sum();
		return sum;
	}
	public double computePercent(double total, double d) {
		// TODO Auto-generated method stub
		double percent = (total*100) / d;
		return percent;
	}
	
}
