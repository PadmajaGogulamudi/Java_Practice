package com.recursionPractice;

public class Factorial {

	public static void main(String[] args) {
		int n = factorialOfNum(4);

		System.out.println(n);
	}

	private static int factorialOfNum(int i) {
		if (i == 0) {
			return 1;
		}
		return i * factorialOfNum(--i);
	}

}
