package com.threads;

class BookSeats {
	int tt = 10;

	void book(int seats) {
		if (seats <= tt) {
			tt -= seats;
			System.out.println("success\nAvailable setas:" + tt);
		} else
			System.err.println("sorry");
	}
}

public class BookMyShow2 extends Thread {
	static BookSeats b;//shared object
	int seats;

	@Override
	public void run() {
		b.book(seats);
	}

	public static void main(String[] args) {
		 b = new BookSeats();
		BookMyShow2 t1 = new BookMyShow2();
		BookMyShow2 t2 = new BookMyShow2();
		t1.seats = 6;
		t2.seats = 6;
		t1.start();
		t2.start();

	}

}
