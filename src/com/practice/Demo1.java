package com.practice;

class A {
	void m(Integer x) {
		System.out.println("A");
	}
}

class B extends A {
	void m(int  x) {
		System.out.println("B");
	}
}

public class Demo1 {
	public static void main(String[] args) {
		A a = new B();
		a.m(5);
	}
}
