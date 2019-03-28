package com.soohyun.overloading;

public class Cal {

	public int plus(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public float plus(int a, float b) {
		float sum = a+b;
		return sum;
	}
	
	public float plus(float a, float b) {
		return a+b;
	}
	
}
