package com.practice;

interface I1 {
	default void hello() {
		System.out.println("I1");
	}
}

interface I2 {
	default void hello() {
		System.out.println("I2");
	}
}

public class Demo2 implements I1, I2 {
	public void hello() {
		System.out.println("Impl");
	} // must override diamond

	public static void main(String[] args) {
		new Demo2().hello();
	}
}
