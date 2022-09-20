package com.service;

import java.util.stream.IntStream;

public class ComputeGrade {

	public int calculateTotal(int[] arr) {
		int sum = IntStream.of(arr).sum();
		return sum;
	}
	
	public double computePercent(double total, double d) {
		// TODO Auto-generated method stub
		double percent = (total*100) / d;
		return percent;
		
	}

	public String computeGrade(double percent) {
		// TODO Auto-generated method stub
//		if(percent >75)
//			return "A";
//		if(percent >65)
//			return "B";
//		else
//			return "C";
		return percent > 75? "A" : percent>60? "B" : "C";
	}
}
