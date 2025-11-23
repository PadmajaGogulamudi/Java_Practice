package com.threads;

public class TestBookMyShow2 {

	public static void main(String[] args) {
		//b = new BookSeats();
		BookMyShow2 t1 = new BookMyShow2();
		BookMyShow2 t2 = new BookMyShow2();
		t1.seats = 6;
		t2.seats = 6;
		t1.start();
		t2.start();

	}

}
