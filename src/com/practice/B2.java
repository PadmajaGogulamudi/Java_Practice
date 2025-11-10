package com.practice;

public class B2 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("x");
		StringBuilder sb2 = new StringBuilder("x");
		System.out.println(sb1.equals(sb2)); // false (no content-equals)
		System.out.println(sb1.toString().equals(sb2.toString())); // true
	}
}
