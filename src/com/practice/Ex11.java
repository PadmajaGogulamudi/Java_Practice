package com.practice;

public class Ex11 {
	public static void main(String[] args) {
		try {
			if (3 % 2 == 0)
				throw new IllegalArgumentException();
			else
				throw new NullPointerException();
		} catch (IllegalArgumentException | NullPointerException e) {
			System.out.println("caught: " + e.getClass().getSimpleName());
			// e = new Exception(); // CE: cannot assign to e (effectively final)
		}
	}
}
     