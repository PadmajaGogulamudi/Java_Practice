package com.interfacesPractice;

public interface InterfaceDemo1 {
	public static final String name="Ammu";
	public abstract void add();
	public default  void sums() {
		System.out.println("hello from default inter");
		secondPrivate();

	}
	public static void abc() {
		System.out.println("hello from inter static");
	}
	private void reduceCode() {
		System.out.println("callint private method");
		secondPrivate();
	}
	public static void main(String[] args) {
		System.out.println("main from interface");
		//reduceCode();
		secondPrivate();

	}
	private static void secondPrivate() {
		System.out.println("runnig static private");
	}
	

}
