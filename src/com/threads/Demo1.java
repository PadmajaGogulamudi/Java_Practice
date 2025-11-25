package com.threads;

class T1 extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("hello");
		} catch (Exception e) {
			System.out.println("inter");
		}
	}
}

public class Demo1 {

	public static void main(String[] args) {
		T1 t = new T1();
		t.start();
		System.out.println("world");
	}

}
