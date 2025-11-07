package com.practice;

interface Utils {
	static void statMethod() {
		System.out.println("interface static methods can be called with interface name ");
	}
}

public class Test {
	public static void main(String[] args) {
		Utils.statMethod();
	}
}