package com.threads;

class TestResource {
	int i;
	boolean status =false;

	synchronized void put(int i) throws InterruptedException {
		if (status) {
			wait();
		}
		this.i = i;
		System.out.println("put :" + i);
		status = true;
		notify();
	}

	synchronized void get() throws InterruptedException {
		if (!status) {
			wait();

		}
		System.out.println("get :" + i);
		status = false;
		notify();
	}

}

class Producer1 implements Runnable {
	TestResource r;

	public Producer1(TestResource r2) {
		r = r2;
		Thread t = new Thread(this, "Producer1");
		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {

			try {
				r.put(i++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class Consumer1 implements Runnable {
	TestResource r;

	public Consumer1(TestResource r2) {
		r = r2;
		Thread t = new Thread(this, "Consumer1");
		t.start();
	}

	@Override
	public void run() {
		while (true) {

			try {
				r.get();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class InterThreadCommunication1 {

	public static void main(String[] args) {
		TestResource r = new TestResource();
		Producer1 p1 = new Producer1(r);
		Consumer1 c = new Consumer1(r);
//		Thread t=new Thread(p1);
//		Thread t1=new Thread(c);
//		t.start();
//		t1.start();

	}

}
