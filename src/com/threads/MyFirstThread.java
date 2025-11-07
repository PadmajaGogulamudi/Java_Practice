package com.threads;

class Thread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hello t1");
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("hello t2");
		}
	}
}

class Thread3 extends Thread {
	@Override

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("hello t3");
		}
	}
}

class WorkForThreads implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("hello :" + Thread.currentThread().getName());
		}

	}

}

public class MyFirstThread {

	public static void main(String[] args) {
//		Thread1 t1=new Thread1();
//		Thread2 t2=new Thread2();
//		Thread3 t3=new Thread3();
//		t1.start();
//		t2.start();
//		t3.start();

		Thread t1 = new Thread(new WorkForThreads());

		Thread t2 = new Thread(new WorkForThreads());

		Thread t3 = new Thread(new WorkForThreads());
		t1.start();
		t2.start();
		t3.start();

	}

}
