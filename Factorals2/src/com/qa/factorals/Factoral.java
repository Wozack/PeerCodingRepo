package com.qa.factorals;

public class Factoral {

	public static long factoral(long subject) {
	long sum = 1;	
		
	for(long i=subject; i >= 1; i--) {
			sum *= i;
		System.out.println(i);
	}
	return sum;
	}
}
