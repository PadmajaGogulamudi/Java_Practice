package com.threads;

public class TestBookMyShow {

	public static void main(String[] args) {
		System.out.println("main start");
		BookMySeats shared=new BookMySeats();
		BookMyShow b1=new BookMyShow(shared,6);
		BookMyShow b2=new BookMyShow(shared,6);
		
		b1.start();
		b2.start();
	}

}
