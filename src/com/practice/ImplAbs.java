package com.practice;

abstract class Abs {
	Abs() {
		System.out.println("Abs ctor");
	}

	abstract void work();
}

public class ImplAbs extends Abs {
	void work() {
		System.out.println("Working");
	}

	public static void main(String[] args) {
		new ImplAbs().work();
	}
}



interface I { void f(); } // before Java 8 only abstract


